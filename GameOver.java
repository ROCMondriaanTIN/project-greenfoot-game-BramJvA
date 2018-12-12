import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("GameOver1.png");
        Fail();
    }
    private void Fail()
    {
    PlayAgain playAgain = new PlayAgain();
    addObject (playAgain, 463, 629);
    Hero.lives = 2;
    Hero.pCount = 0;
    Hero.kCount = 0;
    Hero.dCount = 0;
    
    }
}
