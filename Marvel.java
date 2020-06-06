import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marvel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marvel extends movement
{

    /**
     * Act - do whatever the Marvel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double startTime;
    double endTime;
    int waitTime = 690;
    boolean firing = false;
    public void act() 
    {
        Tembak();
        protect();
        nabrak();
        Control();
        // Add your action code here.
    } 
    
    public void  Laser(){
         startTime = System.currentTimeMillis();
         
         if((startTime - endTime) >= waitTime){
                firing = true;
                Bullet bullet = new Bullet();
                getWorld().addObject(bullet, getX(), getY());
                endTime = System.currentTimeMillis();
                firing = false;
                 Greenfoot.playSound("laser.mp3");
            }
        }
  

    public void Tembak()
    {
        if ("space".equals(Greenfoot.getKey()))
        {
            Laser(); 
            setImage(img3);
        }
    }
    
      public void nabrak()
    {
        if (isTouching(Asteroid.class)) 
        {
            setLocation(55,215);
            removeTouching(Asteroid.class);
            MyWorld MyWorld= (MyWorld)getWorld();
            MyWorld.lives(-1);
        } else if(isTouching(Asteroid2.class))
        {
            setLocation(55,215);
            removeTouching(Asteroid2.class);
            MyWorld MyWorld= (MyWorld)getWorld();
            MyWorld.lives(-1);
        } else if(isTouching(Asteroid3.class))
        {
            setLocation(55,215);
            removeTouching(Asteroid3.class);
            MyWorld MyWorld= (MyWorld)getWorld();
            MyWorld.lives(-1);
        }else if (isTouching(PowerUp.class)) 
        {
            removeTouching(PowerUp.class);
            Shield bigshield = new Shield();
            getWorld().addObject(bigshield, getX(), getY());
    }    
    }
    public void protect()
    {
        if (Greenfoot.isKeyDown("p")) 
        {
            protect protect= new protect();
            getWorld().addObject(protect, getX(), getY());
            Greenfoot.playSound("jet.mp3");
            Boost();
        }
       
        
    }
}
    
  

