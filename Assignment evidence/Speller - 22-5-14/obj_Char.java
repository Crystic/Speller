import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj_Char here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_Char extends Actor
{
    /**
     * Act - do whatever the obj_Char wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        movePlayerHoriz();
    }    
        
    public void movePlayerHoriz()
    {
        int playerSpeed = 3;
        if(getX() <= 475)
        {
            if(Greenfoot.isKeyDown("D"))
            {
                move(playerSpeed);
            }
        }
        
        if(getX() >= 125)
        {
            if(Greenfoot.isKeyDown("A"))
            {
                move(-playerSpeed);
            }
        }
    }
}
