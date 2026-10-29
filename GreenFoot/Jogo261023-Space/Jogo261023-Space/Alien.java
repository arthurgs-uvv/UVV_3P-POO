import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    private int velocidade = 2;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimentar();
        verificarColisaoComNave();
    }
    
    public void movimentar(){
        setLocation(getX() + velocidade, getY());
        
        if(isAtEdge()){
            velocidade =- velocidade;
            setLocation(getX() + velocidade, getY() + 25);
        }
        
        if(getY() >= 580){
            SpaceWorld mundo = (SpaceWorld) getWorld();
            
            if(mundo != null){
                if(!mundo.getObjects(Nave.class).isEmpty()){
                    Nave nave = mundo.getObjects(Nave.class).get(0);
                    nave.receberDano();
                }
                mundo.removeObject(this);
            }
        }
    }
    
    private void verificarColisaoComNave(){
        Actor naveColidida = getOneIntersectingObject(Nave.class);
        
        if(naveColidida != null){
            Nave nave = (Nave) naveColidida;
            nave.receberDano();
            getWorld().removeObject(this);
        }
    }
}
