import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int Nyawa=3;
    public double score=0;
    public boolean deployShield;
    
    public MyWorld()
    {    
        // Create a new world with 1000x500 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
        
        }

    private void prepare()
    {
        Marvel marvel = new Marvel();
        addObject(marvel,142,85);
        marvel.setLocation(491,96);
        marvel.setLocation(335,216);
        marvel.setLocation(462,141);
        removeObject(marvel);
        Marvel Marvel = new Marvel();
        addObject(marvel,54,97);
        marvel.setLocation(53,98);
        marvel.setLocation(54,104);
        marvel.setLocation(55,215);
        Asterior asterior = new Asterior();
        addObject(asterior,908,361);
        Asterior asterior2 = new Asterior();
        addObject(asterior2,758,361);
        Asterior asterior3 = new Asterior();
        addObject(asterior3,597,359);
        Asterior asterior4 = new Asterior();
        addObject(asterior4,439,361);
        Asterior asterior5 = new Asterior();
        addObject(asterior5,298,361);
        Asterior asterior6 = new Asterior();
        addObject(asterior6,157,364);
        Asterior asterior7 = new Asterior();
        addObject(asterior7,47,358);
        Asterior asterior8 = new Asterior();
        addObject(asterior8,926,8);
        Asterior asterior9 = new Asterior();
        addObject(asterior9,779,9);
        Asterior asterior10 = new Asterior();
        addObject(asterior10,639,16);
        Asterior asterior11 = new Asterior();
        addObject(asterior11,497,22);
        Asterior asterior12 = new Asterior();
        addObject(asterior12,340,13);
        Asterior asterior13 = new Asterior();
        addObject(asterior13,188,7);
        Asterior asterior14 = new Asterior();
        addObject(asterior14,58,13);
        asterior.setLocation(955,373);
        asterior2.setLocation(818,367);
        asterior3.setLocation(729,374);
        asterior4.setLocation(559,374);
        asterior5.setLocation(485,384);
        asterior6.setLocation(318,377);
        asterior7.setLocation(175,393);
        Asterior asterior15 = new Asterior();
        addObject(asterior15,64,391);
        vf vf = new vf();
        addObject(vf,954,198);
        vf.setLocation(945,205);
        removeObject(vf);
        vf vf2 = new vf();
        addObject(vf2,945,192);
        asterior15.setLocation(43,441);
        asterior7.setLocation(193,433);
        removeObject(asterior7);
        asterior6.setLocation(258,459);
        asterior5.setLocation(400,429);
        asterior4.setLocation(549,462);
        asterior3.setLocation(601,392);
        asterior2.setLocation(709,459);
        asterior3.setLocation(721,409);
        asterior.setLocation(894,410);
        asterior.setLocation(855,452);
        removeObject(asterior);
        asterior2.setLocation(948,452);
        asterior12.setLocation(363,57);
        asterior11.setLocation(504,81);
        asterior10.setLocation(599,46);
        asterior8.setLocation(884,68);
        asterior9.setLocation(787,41);
        asterior14.setLocation(155,83);
        asterior13.setLocation(61,12);
        asterior14.setLocation(213,52);
        asterior14.setLocation(258,21);
        asterior12.setLocation(370,7);
        asterior11.setLocation(506,7);
        asterior10.setLocation(663,8);
        asterior9.setLocation(785,20);
        asterior8.setLocation(911,67);
        removeObject(asterior8);
        asterior3.setLocation(809,496);
        asterior4.setLocation(687,449);
        asterior5.setLocation(576,442);
        asterior6.setLocation(332,433);
       }
    
    public void act()
    {   
        showHUD();
        addscore();
           
    }
    
    public void level1()
    {
       if (Greenfoot.getRandomNumber(100) < 0.5)
        {
            addObject(new Asteroid(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
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
    
     public void level3()
    {
       if (Greenfoot.getRandomNumber(100) < 3)
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
    
     public void Asteroid3()
     {
       if (Greenfoot.getRandomNumber(250) < 1)
        {
            addObject(new Asteroid3(), 1000, Greenfoot.getRandomNumber(400));
            //Asteroid
        } 
    }
    
     public void addscore()
    {
        score +=0.5;
    }
    
    public double tambah(){
        return score;
    }
    
    public void nextLevel2(){
         if (Greenfoot.isKeyDown("1")) 
        {
            Greenfoot.start();
            uplevel2 level2 = new uplevel2();
            removeObject(level2);
            Level2 Next= new Level2();
            Greenfoot.setWorld(Next);
            
        }
    }
    
    public void nextLevel3(){
         if (Greenfoot.isKeyDown("2")) 
        {
            Greenfoot.start();
            uplevel3 level3 = new uplevel3();
            removeObject(level3);
            Level3 Next= new Level3();
            Greenfoot.setWorld(Next);
        }
    }
    
    public void showHUD()
    {
        showText("Lives : " + Nyawa,70,60);
        showText("Score : " + score,176,60);
    }
    

    public void lives(int hit)
    {
        Nyawa = Nyawa + hit;
        if(Nyawa<0)
        {
            Greenfoot.stop();
            addObject(new GO(), 500, 235);
            Greenfoot.playSound("go.mp3");
        }
    }
    
    
    
   
}
