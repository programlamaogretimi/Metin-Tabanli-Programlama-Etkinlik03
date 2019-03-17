import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class agent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class agent extends Actor
{
    /**
     * Act - do whatever the agent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootSound win = new GreenfootSound("sounds/win.mp3");
    static GreenfootSound winGoal = new GreenfootSound("sounds/win_goal.mp3");
    static GreenfootSound start = new GreenfootSound("sounds/start.mp3");
    static GreenfootSound failure = new GreenfootSound("sounds/failure.mp3");
    static GreenfootSound wallcrash = new GreenfootSound("sounds/wall0.mp3");
    boolean firstMove=true;
    
    public void act() 
    {
     /*etkinlik kodunu yazmaya buradan başlayınız.
      Etkinlikte verilen görevi yerine getirmek
      için gereken kodu "etkinlik kodu sonu" yazan bölüme 
      kadar yazıp kodu "Act" düğmesine tıklayarak çalıştırabilirsiniz.
     */
     turn_right();//sağa dön
     start.play();
      for (int i=1;i<4;i++){//4 kez tekrarla
            Greenfoot.delay(2);// 2 saniye gecikme
            move(); //ilerle
        }
           

           
     //etkinlik kodu sonu
        
     
     
     
     //bu bölümden sonrasında yer alan kodlarda değişiklik yapmayınız.
      if (checkCollisionTarget()) win.play(); else failure.play();//hedefe ulaşıldı mı?
    }  
    
    //sola dön
    public void turn_left()
    {
        turn(-90);
    }
    
    //sağa dön
    public void turn_right()
    {
        turn(90);
    }
    
    //eğer ilerlenecek hücrede duvar yoksa 1 hücre ilerler
    public void move()
    {
        if(firstMove){
            move(1);
            firstMove=false;
            if (checkCollisionWalls()) Greenfoot.stop();
        }else{
            if (!(checkCollisionWalls())) move(1);
        }
        
    }
    //Hedefe ulaşılıp ulaşılmadığı kontrolü
    private boolean checkCollisionTarget()
    {
       Actor labirenttarget=getOneIntersectingObject(target.class);
       boolean b=false;
       if((labirenttarget!=null))
       {
           winGoal.play();
           Greenfoot.delay(2);// 2 saniye gecikme
           getWorld().removeObject(labirenttarget);
           b=true;
        }
        return b;
    }
    
    //Duvara çarpıp çarpmadığı kontrolü
        private boolean checkCollisionWalls()
    {
       Actor labirentwall = getOneIntersectingObject(walls.class);
       boolean b=false;
       if((labirentwall!=null))
       {
           wallcrash.play();
           Greenfoot.delay(2);
           getWorld().removeObject(labirentwall);
           Greenfoot.stop();
           b=true;
        }
        return b;
    }

}
