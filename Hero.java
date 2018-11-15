
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 1.0;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        Pos();
        Remove();
        velocityX *= drag;
        velocityY += acc;
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
        }
    }
    
    public String Pos()
    {
        String mijnPositie = "X" + getX() + "Y" + getY(); 
        return mijnPositie;
    }
        

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
