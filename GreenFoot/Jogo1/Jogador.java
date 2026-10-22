import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogador extends Actor
{
    /**
     * Act - do whatever the Jogador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        verificarTeclas();
        coletarMoedas();
    }
    
    private void verificarTeclas(){
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(4);
        }
        
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(4);
        }
        
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(4);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(4);
        }
    }
    
    private void coletarMoedas(){
        Actor moeda = getOneIntersectingObject(Moeda.class);
        if(moeda != null){
            getWorld().removeObject(moeda);
        }
    }
}
