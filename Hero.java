
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private double acc;
    private final double drag;
    private int spawnX;
    private int spawnY;
    private boolean firstAct = true;
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
        if(firstAct)
        {
            firstAct = false;
            spawnX = getX();
            spawnY = getY();
        }
        for (Platform platform : getIntersectingObjects(Platform.class)) {
            if (platform != null) {
                isTouchingMovingPlatform = true;
            }
        }
        if(isTouchingMovingPlatform == false) {
            velocityX *= drag;
            velocityY += acc;
        }      
        getWorld().showText(""  + Integer.toString(dCount), 40, 90);
        getWorld().showText("" + Integer.toString(pCount), 950, 40);
        getWorld().showText(" X = " + Integer.toString(getX()), 950, 113);
        getWorld().showText(" Y = " + Integer.toString(getY()), 950, 93);
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        /*for (Actor enemy : getIntersectingObjects(Enemy.class)) {
        if (enemy != null) {
        getWorld().removeObject(this);
        Greenfoot.setWorld(new GameOver());
        break;
        }
        }*/
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

    public void TerugTP()
    {
        setLocation(spawnX,spawnY);
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
                    lives --;
                }

            }
        }
    }

    public void Lives()
    {
        getWorld().showText("" + lives, 40 , 40);
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
        if(isTouching(gemBlue.class))
        {
            removeTouching(gemBlue.class);
            dCount ++;
        }
        if(isTouching(keyGreen.class))
        {
            removeTouching(keyGreen.class);
            kCount = 1;
        }
        if(pCount >=40)
        {
            pCount -= 40;
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
