import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Mover
{
    /**
     * Act - do whatever the platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Teller;
    static int Nummer;
    private int Nummer2;
    public Platform()
    {
        getImage().mirrorVertically();
       
    }
    
    public void act() 
    {
        PLbewegen();
        for(Mover mover: getIntersectingObjects(Mover.class)) {
            if(mover != null){
                mover.velocityX = velocityX;
                mover.velocityY = velocityY;
            }
        }
        applyVelocity();
    }    
    
    public void PLbewegen()
    {
        if(Teller == 0)
        {
            //setLocation(getX()-2,getY()+4);
            velocityX = 2;
            velocityY = -2;
        }
        //naar boven
        
         if(Teller == 176)
        {
            velocityX = 0;
            velocityY = 0;   
        }
        //wacht
        if(Teller == 250)
        {
            //setLocation(getX()+2,getY()-4 );
            velocityX = -2;
            velocityY = 2;
        }
        // naar beneden
       
        if(Teller == 426)
        {
            velocityX = 0;
            velocityY = 0;   
        }
        //wacht
        if(Teller >= 500) {
            Teller = 0;
            return;
        }
        Teller ++;
       
    }
    
    
}



