import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * I DID NOTHING FOR THE CANON (I try but i didn't work :/) 
 */
public class Canon extends Actor
{
    private static final double CANNON_BALL_VELOCITY = 1500.0;
    private int canonReloadTime;
    private int reloadDelayCount;
    private int shotsCannon;
    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Canon(){
        canonReloadTime = 10;
        reloadDelayCount = 0;
        shotsCannon = 0;
    }
    public void act()
    {
       fire();
    }
    public void fire(){
        if ((reloadDelayCount >= canonReloadTime)){
            CannonBall newBall= new CannonBall();
            getWorld().addObject(newBall,getX(), getY());
            shotsCannon = shotsCannon + 1;
            reloadDelayCount = 0;
    }
    }
    
}
