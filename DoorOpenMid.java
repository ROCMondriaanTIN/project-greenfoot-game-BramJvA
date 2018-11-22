import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorOpenMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorOpenMid extends Tile
{
    /**
     * Act - do whatever the DoorOpenMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DoorOpenMid(String image, int width, int heigth) {
        super(image, width, heigth);
    }
    public void act() 
    {
        if(kCount == 0)
        {
           setImage("door_closedMid.png"); 
        }
            
    }    
}
