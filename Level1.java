
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends MyWorld
{
    public Level1()
    {
        prepare();
    }

    public void act (){
        level1();
        showHUD();
        addscore();
        GantiWorld();
        nextLevel2();
        Asteroid3();
        powerUp();
    }
    
   
     public void GantiWorld()
    {
       
         {
        if(tambah()>=10){  
            addObject(new uplevel2(), 500, 235);
            Greenfoot.delay(150); 
        }
    
    }
    }
    
       public void powerUp()
    {
       if (tambah()==4000)
        {
            addObject(new PowerUp(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        }   
    }
    
    private void prepare()
    {
    }
}
