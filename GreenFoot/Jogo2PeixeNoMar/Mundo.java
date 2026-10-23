import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jogador(), 300, 200);
        
        for(int i = 50; i < 550; i = i + 44){
            for(int j = 50; j < 350; j = j + 33){
                addObject(new Alimento(), i, j);
            }
        }
        /*
        addObject(new Alimento(), 100, 100);
        addObject(new Alimento(), 200, 350);
        addObject(new Alimento(), 500, 200);
        */
    }
}
