import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movement extends Actor
{   
    GreenfootImage img1 = new GreenfootImage("marvel1.png");
    GreenfootImage img2 = new GreenfootImage("marvel2.png");
    GreenfootImage img3 = new GreenfootImage("marvel3.png");
    
    /**
     * Act - do whatever the movement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void Control()
    {
        if (Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY()-4);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX()-4, getY());
            setImage(img1);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+4, getY());
            setImage(img2);
        }
    }
    
      public void Boost()
    {
        if (Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY()-8);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()+8);
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX()-8, getY());
            setImage(img1);
        }
        if (Greenfoot.isKeyDown("d")) 
        {
            setLocation(getX()+8, getY());
            setImage(img2);
        }
    }
    
    public void ControlShield()
    {
        if (Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY()-4);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX()-4, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+4, getY());
        }
    }
    
      public void BoostShield()
    {
        if (Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY()-8);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()+8);
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX()-8, getY());
        }
        if (Greenfoot.isKeyDown("d")) 
        {
            setLocation(getX()+8, getY());
        }
    }
    
}
