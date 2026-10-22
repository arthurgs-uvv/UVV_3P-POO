import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeuMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeuMundo extends World
{

    /**
     * Constructor for objects of class MeuMundo.
     * 
     */
    public MeuMundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jogador(), 300, 200);
        
        addObject(new Moeda(), 100, 100);
        addObject(new Moeda(), 500, 250);
        addObject(new Moeda(), 300, 300);
    }
}
