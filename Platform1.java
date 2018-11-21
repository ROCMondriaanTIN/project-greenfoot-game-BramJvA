import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform1 extends Mover
{
    /**
     * Act - do whatever the platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform1()
    {
        getImage().mirrorVertically();
        
    }
    public void act() 
    {
        applyVelocity();
        if(Greenfoot.isKeyDown("up"))
        {
         PLbewegen();   
        }
        if(Greenfoot.isKeyDown("left"))
        {
         Bew1();   
        }
        if(Greenfoot.isKeyDown("right"))
        {
         Bew2();   
        }
    }    
    
    public void PLbewegen()
    {
         for(int i = 0; i < 2; i ++)
        {
            setLocation(getX()-4,getY()+2 );
            velocityX = 2;
            velocityY = 2;
        }
        for(int i = 0; i < 2; i ++)
        {
            setLocation(getX()+4,getY()-2);
            velocityX = -2;
            velocityY = -2;
        }

    }
    public void Bew1()
    {
         velocityX = 2;
         velocityY = 2;
    }
    public void Bew2()
    {
        velocityX = -2;
        velocityY = -2;
    }
    
}



