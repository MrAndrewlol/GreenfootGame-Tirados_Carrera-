import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    public void act()
    {
        // Add your action code here.
        moveAround();
        mascara();
    }
    public void moveAround()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        setLocation(getX() ,getY() -3);
        if(Greenfoot.isKeyDown("s"))
        setLocation(getX() ,getY() + 3);
        if(Greenfoot.isKeyDown("a"))
        setLocation(getX() -3 ,getY());
        if(Greenfoot.isKeyDown("d"))
        setLocation(getX() +3 ,getY());
    }
    public void mascara()
    {
        // Add your action code here.
        Actor mascara1 = getOneIntersectingObject(mascara.class);
        if(mascara1 != null)
        {
            getWorld().removeObject(mascara1);
            thisGame.score++;
        }
    }

}

