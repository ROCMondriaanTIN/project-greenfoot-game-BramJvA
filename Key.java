import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends HUD
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Hero.kCount == 0)
        {
            setImage("hud_keyGreem_disabled.png");
        }
        if(Hero.kCount == 1)
        {
            setImage("hud_keyGreen.png");
        }
        
    }    
}
