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
       /* if (Hero.kCount == 0)
        {
           setImage("door_closedMid.png"); 
        }*/
        if(Hero.kCount == 1)
        {
            setImage("door_openMid.png");
        
        for(Actor hero: getIntersectingObjects(Hero.class))
        {
            if(hero != null && getWorld() instanceof MyWorld && (Greenfoot.isKeyDown("s")))
            {
                Map2 Map = new Map2();
                Greenfoot.setWorld(Map);
                break;
                
            }
            if(hero != null && getWorld() instanceof Map2 && (Greenfoot.isKeyDown("s")))
            {
                MyWorld MyWorld = new MyWorld();
                Greenfoot.setWorld(MyWorld);
                break;
            }
        }
        getImage().scale(60,60);
        }
        
        
    }    

}