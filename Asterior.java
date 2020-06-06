import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asterior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asterior extends Actor
{
    /**
     * Act - do whatever the Asterior wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Gerak();
        // Add your action code here.
    }    
    
     public void Gerak()

    {
        setLocation(getX()-2, getY());

        if (getX() == 0) 
        {
            setLocation(1000,getY());
        }
        
    }
}
