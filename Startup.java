import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/* menu start game */
public class Startup extends World
{

    /**
     * Constructor for objects of class Startup.
     * 
     */
    public Startup()
    {    
        // Create a new world with 1000x500 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
    }

    public void act(){
        start();
        level2();
        Asteroid2();
    }

    public void start(){
        if (Greenfoot.isKeyDown("enter"))
        {
            Level1 Next= new Level1();
            Greenfoot.setWorld(Next);
        }
    }
    
     public void level2()
    {
       if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Asteroid(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        } 
    }
    
      public void Asteroid2()
     {
       if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Asteroid2(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        } 
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
