import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{

    /**
     * Constructor for objects of class SpaceWorld.
     * 
     */
    public SpaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 600, 1);
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Nave(), 150, 520);
        
        int quantLinha = 3;
        int quantColuna = 6;
        
        for(int linha = 1; linha <= quantLinha; linha++){
            for(int coluna = 1; coluna <= quantColuna; coluna++){
                addObject(new Alien(), linha*300/(quantLinha+1), coluna*600/quantColuna);
            }
        }
    }
}
