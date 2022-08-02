import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mascara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mascara extends Actor
{
    /**
     * Act - do whatever the mascara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int touch;
    public void act()
    {
        move(touch);
        if(isAtEdge())
        touch = -touch;
        setRotation(45);
      
    }
}
