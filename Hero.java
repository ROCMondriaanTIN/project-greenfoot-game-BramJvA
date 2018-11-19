
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int pCount;
    public int dCount;
    public int kCount;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 1.0;
        drag = 0.8;
        setImage("hud_p3Alt.png");
    }

    @Override
    public void act() {
        handleInput();
        Pos();
        Remove();
        velocityX *= drag;
        velocityY += acc;
        getWorld().showText("Key = "  + Integer.toString(kCount),948, 71);
        getWorld().showText("Diamanten = "  + Integer.toString(dCount),917, 30);
        getWorld().showText("Coins = " + Integer.toString(pCount), 940, 50);
        getWorld().showText(" X = " + Integer.toString(getX()), 950, 113);
        getWorld().showText(" Y = " + Integer.toString(getY()), 950, 93);
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
    public void Remove()
    {
        
        if(isTouching(coinGold.class))
        {
            removeTouching(coinGold.class);
            pCount += 2;
        }
        if(isTouching(coinSilver.class))
        {
            removeTouching(coinSilver.class);
            pCount ++;
        }
        if(isTouching(gemGreen.class))
        {
            removeTouching(gemGreen.class);
            dCount ++;
        }
        if(isTouching(keyGreen.class))
        {
            removeTouching(keyGreen.class);
            kCount ++;
        }
    }
    
    public String Pos()
    {
        String mijnPositie = "X" + getX() + "Y" + getY(); 
        return mijnPositie;
    }
        

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            velocityY = -12;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
