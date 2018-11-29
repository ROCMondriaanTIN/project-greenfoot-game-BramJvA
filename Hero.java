
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private double acc;
    private final double drag;
    public static int pCount;
    public static int dCount;
    public static int kCount;
    public boolean isTouchingMovingPlatform = false;
    public static int lives = 2;
    public boolean isHit;
    private int hitTimer = 0;

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
        Damage();
        Lives();
        Hit();
        isTouchingMovingPlatform = false;
        for (Platform platform : getIntersectingObjects(Platform.class)) {
            if (platform != null) {
                isTouchingMovingPlatform = true;
            }
        }
        if(isTouchingMovingPlatform == false) {
            velocityX *= drag;
            velocityY += acc;
        }
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
                Greenfoot.setWorld(new GameOver());
                break;
            }
        }
    }

    public void Hit() {   
        if(isHit == true) {
            if(hitTimer == 10) {
                isHit = false;
                hitTimer = 0;
            }
            hitTimer++;
        }
    }

    public void Damage()
    {

        for (Actor hero : getIntersectingObjects(DangerousTiles.class))
        {
            MyWorld world = new MyWorld();
            if (hero != null) {
                if(lives >= 1 && isHit == false) {  
                    if (getWorld().getClass() == MyWorld.class) {
                        setLocation(468, 2918);
                    } else if (getWorld().getClass() == Map2.class) {
                        setLocation(390, 338);
                    }
                    //setLocation(468, 2918);
                    isHit = true;                       
                    lives = lives - 1;
                }

            }
        }
    }

    public void Lives()
    {
        getWorld().showText("Lives = " + lives,848, 71);
        if(lives < 1) {
            setImage("invisible.png");
            Greenfoot.setWorld(new GameOver());          
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
            kCount = 1;
        }
        if(pCount >=40)
        {
            pCount = 0;
            lives++;
        }
    }

    public String Pos()
    {
        String mijnPositie = "X" + getX() + "Y" + getY(); 
        return mijnPositie;
    }

    public void handleInput() {
        if(Greenfoot.isKeyDown("p")){
            MyWorld world = new MyWorld();            
            Greenfoot.setWorld(world);

        }
        if(Greenfoot.isKeyDown("o")){
            Map2 world = new Map2();            
            Greenfoot.setWorld(world);

        }
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
