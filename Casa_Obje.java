import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa_Obje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa_Obje extends Actor
{
    /**
     * Act - do whatever the Casa_Obje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       Actor Animal = getOneIntersectingObject(Animal.class);
       if(isTouching(Animal.class)) 
       {getWorld().removeObject(Animal); 
        getWorld().addObject(new Win(), 620, 310);
        }
            
        Actor Competidor = getOneIntersectingObject(Competidor.class);
        if(isTouching(Competidor.class))
        {getWorld().removeObject(Competidor); 
        getWorld().addObject(new Win(), 620, 310);
        }
        
    }
}

