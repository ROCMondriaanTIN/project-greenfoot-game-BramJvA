import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coinGold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coinGold extends Tile
{
    /**
     * Act - do whatever the coinGold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public coinGold(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    public void act() 
    {
    if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
        }
    }    
}
