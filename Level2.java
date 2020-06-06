import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends MyWorld
{
    public Level2()
    {
    }
    
    
     public void act (){
        level2();
        Asteroid2();
        showHUD();
        addscore();
        Asteroid3();
        GantiWorld();
        nextLevel3();
    }
    
     public void GantiWorld()
    {
       
         {
        if(tambah()>=20){  
            addObject(new uplevel3(), 500, 235);
            Greenfoot.delay(150); 
        }
    
    }
    }
    
     public void powerUp()
    {
       if (tambah()==5000)
        {
            addObject(new PowerUp(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        }   
    }
    
}
