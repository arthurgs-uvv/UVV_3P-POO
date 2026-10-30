import greenfoot.*;

public class Nave extends Actor {
    private int cooldownTiro = 0;
    private int vida = 3;

    public Nave() {
        setRotation(270); // Posiciona a nave apontada para cima
    }

    @Override
    public void addedToWorld(World world) {
        // Exibe a quantidade inicial de vidas assim que entra no mundo
        ((SpaceWorld) world).atualizarVida(vida);
    }

    public void act() {
        movimentar();
        atirar();
        verificarVitoria();
    }

    private void movimentar() {
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 5, getY());
        }
    }

    private void atirar() {
        if (cooldownTiro > 0) {
            cooldownTiro--;
        }

        if (Greenfoot.isKeyDown("space") && cooldownTiro == 0) {
            getWorld().addObject(new Tiro(), getX(), getY() - 30);
            cooldownTiro = 30; // Intervalo de 15 quadros entre disparos
        }
    }

    // Método chamado quando um alienígena colide com a nave ou atinge a base
    public void receberDano() {
        vida--;
        SpaceWorld mundo = (SpaceWorld) getWorld();
        
        if (mundo != null) {
            mundo.atualizarVida(vida);

            if (vida <= 0) {
                mundo.gameOver();
                mundo.removeObject(this);
            }
        }
    }

    private void verificarVitoria() {
        SpaceWorld mundo = (SpaceWorld) getWorld();
        if (mundo != null) {
            mundo.verificarVitoria();
        }
    }
}