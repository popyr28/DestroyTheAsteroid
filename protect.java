import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PersonalSheild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class protect extends Actor
{
    /**
     * Act - do whatever the PersonalSheild wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        delete();
    }    
    
    public void delete()
    {
        getWorld().removeObject(this);
    }
}
