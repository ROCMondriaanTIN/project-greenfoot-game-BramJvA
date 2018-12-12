import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player3 extends Tile
{
    /**
     * Act - do whatever the Player3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player3(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    Hero h;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            h.s = 3;
            Greenfoot.setWorld(new MyWorld());
            
        }
    }    
}
