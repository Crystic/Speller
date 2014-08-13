import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj_btnPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_btnPlay extends Actor
{
    /**
     * Act - do whatever the obj_btnPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Checks the button is clicked
        if(Greenfoot.mouseClicked(this))
        {
            //Changes the world to GameWorld.
            Greenfoot.setWorld(new GameWorld());
        }
    }    
}
