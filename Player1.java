import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Tile
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    Hero h;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            h.s = 1;
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
