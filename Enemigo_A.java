import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo_A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo_A extends Actor
{
    /**
     * Act - do whatever the Enemigo_A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Elocx;
    int Elocy;
    int speed;
    public void act()
    {
        
        setLocation(getX() +speed ,getY() );
        if(isTouching(barrera.class)){
            setLocation( Elocx, Elocy);
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
