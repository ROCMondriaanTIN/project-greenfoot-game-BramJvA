import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gemGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gemBlue extends Tile
{
    private boolean activated;
    /**
     * Act - do whatever the gemGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gemBlue(String image, int width, int heigth) {
        super(image, width, heigth);
    }

    public void dRes()
    {
        if ((getWorld() instanceof MyWorld && !activated)) {
            activated = true;
            Verandering.list.add(1);
        }
        if ((getWorld() instanceof Map2 && !activated)) {
            activated = true;
            Verandering.list.add(2);
        }
    }

    public void act() 
    {
        dRes();
        if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
        }
        else{
            for(int i = 0; i < Verandering.list.size(); i ++) {
                if(Verandering.list.contains(i)) {
                    getWorld().removeObject(this);
                }
            }
        }
    }    
}
