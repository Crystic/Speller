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
        if(getX() < 121)
        {
            setLocation(135, getY());
        }
         
        if(getX() > 479)
        {
            setLocation(465, getY());
        }
    }    
        
    public void movePlayerHoriz()
    {        
        if(getX() > 121 && getX() < 479)
        {
            if(Greenfoot.isKeyDown("D"))
            {
                setLocation(getX()+3, getY());
            }
    
            if(Greenfoot.isKeyDown("A"))
            {
                setLocation(getX()-3, getY());
            }
        }
    }
}
