// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("rigth")) {
            turn(-4);
        }
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * //if is touching the finishlocation win the game
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (isTouching(FinishLocation.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * //transition to GameWverWorld
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }

    /**
     * //if touching cannonball =game over
     */
    public boolean isGameOver()
    {
        if (isTouching(CannonBall.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * //transition to GameOverWorld
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
