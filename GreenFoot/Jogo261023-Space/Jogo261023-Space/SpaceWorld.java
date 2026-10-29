import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{
    private int pontuacao = 0;
    /**
     * Constructor for objects of class SpaceWorld.
     * 
     */
    public SpaceWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Nave(), 200, 520);
        
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 5; j++){
                addObject(new Alien(), i*67, j*70);
                
                /* EXEMPLO PROFESSOR
                 * i < 3 e j < 6
                 * int x = 100 + (coluna * 80);
                 * int y = 60 + (linha * 50);
                 * addObject(new Alien(), x, y);
                 */
                
            }
        }
        
        atualizarPlacar();
        atualizarVida(5);
    }
    
    public void aumentarPontuacao(int pontos){
        pontuacao += pontos;
        atualizarPlacar();
    }
    
    public void atualizarPlacar(){
        showText("Pontos: " + pontuacao, 80, 25);
        //showText(Texto a ser mostrado, local no x, local no y)
    }
    
    public void atualizarVida(int vida){
        showText("Vidas: " + vida, 310, 25);       
    }
    
    public void gameOver(){
        showText("GAME OVER", 200, 300);
        Greenfoot.stop();
    }
    
    public void verificarVitoria(){
        if(getObjects(Alien.class).isEmpty()){
        showText("VOCE VENCEU!", 200, 300);
        Greenfoot.stop();
        }
    }
}
