import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo2 extends Actor
{
    /**
     * Act - do whatever the enemigo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int locx;
    int locy;
    public void act()
    {
     
        setLocation(getX() ,getY() - 2);
        if(isTouching(barrera.class)){
        setLocation(locx ,locy);
    }
            Actor Animal = getOneIntersectingObject(Animal.class);
       if(isTouching(Animal.class)) 
       {getWorld().removeObject(Animal); 
        getWorld().addObject(new lost(), 620, 310);
        }
            
        Actor Competidor = getOneIntersectingObject(Competidor.class);
        if(isTouching(Competidor.class))
        {getWorld().removeObject(Competidor); 
        getWorld().addObject(new lost(), 620, 310);
        }
    }
}
