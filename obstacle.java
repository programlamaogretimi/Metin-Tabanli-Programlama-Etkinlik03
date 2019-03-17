import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacle extends Actor
{
    /**
     * Act - do whatever the obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootSound obstacle = new GreenfootSound("sounds/obstacle.mp3");
    public void act() 
    {
        // Add your action code here.
        checkCollision();
    } 
    private void checkCollision()
    {
       agent a = (agent) getOneIntersectingObject(agent.class);
       if(a!=null)
       {
           obstacle.play();
           getWorld().removeObject(a);
           getWorld().removeObject(this);
        }
    }
}
