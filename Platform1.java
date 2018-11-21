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
    int Teller;
    public Platform1()
    {
        getImage().mirrorVertically();
        
    }
    
    public void act() 
    {
        PLbewegen();
        applyVelocity();
        if(Greenfoot.isKeyDown("up"))
        {
         PLbewegen();   
        }
       
    }    
    
    public void PLbewegen()
    {
        if(Teller == 1)
        {
            //setLocation(getX()-2,getY()+4);
            velocityX = -1;
            velocityY = -1;
        }

        if(Teller == 40)
        {
            //setLocation(getX()+2,getY()-4 );
            velocityX = 1;
            velocityY = 1;
        }
        if(Teller >= 79)
        {
            Teller = 0;
        }
        Teller ++;
    }
    
    
}



