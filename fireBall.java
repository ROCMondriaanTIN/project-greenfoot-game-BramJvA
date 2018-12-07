import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class fireBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireBall extends Tile
{
    /**
     * Act - do whatever the fireBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public fireBall(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    public void act() 
    {
        setImage("fireball.png");
        turn(5);
        if(isTouching(Hero.class))
        {
            List <Hero> hero = getWorld().getObjects(Hero.class);
            hero.get(0).TerugTP();
            Greenfoot.delay(5);
            Hero.lives --;
            
        }
        
    }    
}
