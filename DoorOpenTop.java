import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorOpenTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorOpenTop extends Tile
{
    /**
     * Act - do whatever the DoorOpenTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DoorOpenTop(String image, int width, int heigth) {
        super(image, width, heigth);
    }   
    public void act() 
    {
        /*if (Hero.kCount == 0)
        {
           setImage("door_closedTop.png"); 
        }*/
        if(Hero.kCount == 1)
        {
            setImage("door_openTop.png");
        
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


