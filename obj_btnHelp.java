import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj_btnHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_btnHelp extends Actor
{
    /**
     * Act - do whatever the obj_btnHelp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //When this button is clicked, set the world to HelpWorld.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HelpWorld());
        }
    }    
}
