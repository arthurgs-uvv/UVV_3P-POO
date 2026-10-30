import greenfoot.*;

public class Tiro extends Actor {

    public void act() {
        setLocation(getX(), getY() - 8);
        verificarColisao();
    }

    private void verificarColisao() {
        // Colisão com o Alienígena
        Actor alien = getOneIntersectingObject(Alien.class);
        if (alien != null) {
            SpaceWorld mundo = (SpaceWorld) getWorld();
            if (mundo != null) {
                mundo.aumentarPontuacao(10); // Concede 10 pontos por abate
                mundo.removeObject(alien);
                mundo.removeObject(this);
            }
            return;
        }

        // Remoção ao atingir o limite superior da tela
        if (isAtEdge() && getY() <= 10) {
            getWorld().removeObject(this);
        }
    }
}