import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj_btnQuit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_btnQuit extends Actor
{
    /**
     * Act - do whatever the obj_btnQuit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Checks if the button is clicked.
        if(Greenfoot.mouseClicked(this))
        {
            //Stops the game.
            Greenfoot.stop();
        }
    }    
}
