import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class target extends Actor
{
    /**
     * Act - do whatever the target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootSound winGoal = new GreenfootSound("sounds/win_goal.mp3");
    static GreenfootSound win = new GreenfootSound("sounds/win.mp3");
    public void act() 
    {
        // Add your action code here.
        //checkCollision();
    }    
    
    /*private void checkCollision()
    {
       Actor a = getOneIntersectingObject(agent.class);
       if(a!=null)
       {
           //labirentSiralama maze=(labirentSiralama)getWorld();
           winGoal.play();
           Greenfoot.delay(2);// 2 saniye gecikme
           //maze.removeObject(this);
           getWorld().removeObject(this);
           win.play();
           Greenfoot.stop();
        }
    }*/
    public void turn_left()
    {
        turn(-90);
    }
    
    public void turn_right()
    {
        turn(90);
    }
}
