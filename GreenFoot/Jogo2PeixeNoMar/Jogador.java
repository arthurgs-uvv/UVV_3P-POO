import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogador extends Actor
{
    /**
     * Act - do whatever the Peixe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 0;
    
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
            move(2);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(2);
        }
    }
    
    private void coletarMoedas(){
        Actor alimento = getOneIntersectingObject(Alimento.class);
        if(alimento != null){
            getWorld().removeObject(alimento);
            score += 100;
        }
    }
}
