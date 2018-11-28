import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keyGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keyGreen extends Tile
{
    /**
     * Act - do whatever the keyGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public keyGreen(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    public void act() 
    {
        if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
            Hero.kCount++;
        }
        
    }    
}
