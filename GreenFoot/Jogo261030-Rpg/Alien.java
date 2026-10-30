import greenfoot.*;

public class Alien extends Actor {
    private int velocidade = 6;

    public void act() {
        movimentar();
        verificarColisaoComNave();
    }

    private void movimentar() {
        setLocation(getX() + velocidade, getY());

        // Inverte o sentido e avança uma linha ao tocar na borda lateral
        if (isAtEdge()) {
            velocidade = -velocidade;
            setLocation(getX() + velocidade, getY() + 40);
        }

        // Caso o alienígena alcance a parte inferior da tela (limite da base)
        if (getY() >= 580) {
            SpaceWorld mundo = (SpaceWorld) getWorld();
            if (mundo != null) {
                if (!mundo.getObjects(Nave.class).isEmpty()) {
                    Nave nave = mundo.getObjects(Nave.class).get(0);
                    nave.receberDano();
                }
                mundo.removeObject(this);
            }
        }
    }

    private void verificarColisaoComNave() {
        Actor naveColidida = getOneIntersectingObject(Nave.class);
        if (naveColidida != null) {
            Nave nave = (Nave) naveColidida;
            nave.receberDano(); // Aplica dano à nave
            getWorld().removeObject(this); // O alien é destruído com o impacto
        }
    }
}