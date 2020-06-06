import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Jalan();
        
    }    

    public void Jalan()
    {
        move(10);
        if ( isTouching(Asteroid.class) ) 
        {
            removeTouching(Asteroid.class);
            MyWorld space = (MyWorld)getWorld();
            Greenfoot.playSound("explosion.mp3");
            space.removeObject(this);
        } else if ( isTouching(vf.class) ) 
        {            
            MyWorld space = (MyWorld)getWorld();
            space.removeObject(this);
        } else if (isTouching(Asteroid3.class))
        {
            removeTouching(Asteroid3.class);
            MyWorld space = (MyWorld)getWorld();
            Greenfoot.playSound("explosion.mp3");
            space.removeObject(this);
        }  
    }
    
    
   
}
