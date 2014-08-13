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
        //Runs the movePlayerHoriz method.
        movePlayerHoriz();
    }    
        
    public void movePlayerHoriz()
    {
        //Player speed
        int playerSpeed = 3;
        
        //Checks to see that the player is within the right boundry
        if(getX() <= 475)
        {
            //Checks to see if the D key is down.
            if(Greenfoot.isKeyDown("D"))
            {
                //Moves the player
                move(playerSpeed);
            }
        }
        
        //Same as above but to the left.
        if(getX() >= 125)
        {
            //Same as above but with A key.
            if(Greenfoot.isKeyDown("A"))
            {
                //Moves the player.
                move(-playerSpeed);
            }
        }
    }
}
