import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends movement
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ControlShield();
        nabrak2();// Add your action code here.
    }    
    
    public void nabrak2(){
          if (isTouching(Asteroid.class)) 
        {
            removeTouching(Asteroid.class);
         } else if(isTouching(Asteroid2.class))
        {
            removeTouching(Asteroid2.class);
            } else if(isTouching(Asteroid3.class))
        {
            removeTouching(Asteroid3.class);
         }
        }
}
