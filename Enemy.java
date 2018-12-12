
import greenfoot.*;
import java.util.List;
/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Enemy(int walkRange) {
        super();
        setImage("snailWalk1.png");
        getImage().mirrorHorizontally();
        this.walkRange = walkRange;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        EnemyKill();
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }
    
    public void EnemyKill()
    { 
        if (getOneObjectAtOffset(-19, -45, Hero.class) != null || getOneObjectAtOffset(19, -45, Hero.class) != null) 
       {  
           getWorld().removeObject(this);  
           Hero.pCount += 5;
           
       } 
       else if(getOneObjectAtOffset(-19, 10, Hero.class) != null || getOneObjectAtOffset(19, 10, Hero.class) != null )
       {  
           List <Hero> hero = getWorld().getObjects(Hero.class);
           hero.get(0).TerugTP();
           Greenfoot.delay(6);
           Hero.lives --;
       }
    }
}

