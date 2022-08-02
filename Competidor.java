import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Competidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Competidor extends Actor
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
        if(Greenfoot.isKeyDown("up"))
        setLocation(getX() ,getY() -3);
        if(Greenfoot.isKeyDown("down"))
        setLocation(getX() ,getY() + 3);
        if(Greenfoot.isKeyDown("left"))
        setLocation(getX() -3 ,getY());
        if(Greenfoot.isKeyDown("right"))
        setLocation(getX() +3 ,getY());
    }
    public void mascara()
    {
        // Add your action code here.
        Actor mascara1 = getOneIntersectingObject(mascara.class);
        if(mascara1 != null)
        {
            getWorld().removeObject(mascara1);
            thisGame.score2++;
        }
    }
}