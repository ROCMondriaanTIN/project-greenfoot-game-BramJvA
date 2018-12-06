
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HUD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HUD extends Actor
{
    /**
     * Act - do whatever the HUD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean FirstAct = true;
     public HUD() {
        
    }
    public void act() 
    {
      if(FirstAct)
      {
          getWorld().addObject(new Levens(), 40, 40);
          getWorld().addObject(new Punten(), 950, 40);
          getWorld().addObject(new Diamanten(), 40, 90);
          getWorld().addObject(new Key(), 40, 140);
          FirstAct = false;
        }
        
    }    
}
