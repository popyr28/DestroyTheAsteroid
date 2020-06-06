import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AsteroidMove extends Actor
{
    /**
     * Act - do whatever the AsteroidMove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
     public void AsteroidMuncul()
    {
        setLocation(getX()-6, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
    
     public void AsteroidMuncul2()
    {
        setLocation(getX()-12, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
    
     public void AsteroidMuncul3()
    {
        setLocation(getX()-2, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
    
      public void powerUpJalan()
    {
        setLocation(getX()-3, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
    
    public void putar(){
        turn(-3);
    }
}
