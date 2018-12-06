import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gemGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gemBlue extends Tile
{
    /**
     * Act - do whatever the gemGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public gemBlue(String image, int width, int heigth) {
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
