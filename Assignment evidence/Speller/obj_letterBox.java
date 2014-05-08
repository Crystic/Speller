import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj_letterBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_letterBox extends Actor
{
    /**
     * Act - do whatever the obj_letterBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveObjVert();
        collision();
        //genLetter();
    }    
    
    public void moveObjVert()
    {
        setLocation(getX(), getY()-5);
        if(getY() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void collision()
    {
        Actor Character = getOneIntersectingObject(obj_Char.class);
        if(Character != null)
        {
            getWorld().removeObject(this);
        }
    }
}
