import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3 extends MyWorld
{
    public Level3()
    {
    }
     public void act (){
        level3();
        Asteroid2();
        Asteroid3();
        showHUD();
        addscore();
        GantiWorld();
    }
    
       public void GantiWorld()
    {
       
         {
        if(tambah()>=30){  
            addObject(new Finisihed(), 500, 235);
            Greenfoot.stop(); 
        }
    
    }
    }
    
     public void powerUp()
    {
       if (tambah()==7000)
        {
            addObject(new PowerUp(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        }   
    }
    
    
}
