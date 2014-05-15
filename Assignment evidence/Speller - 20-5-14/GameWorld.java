import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    
    //Date timer;
    
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        prepare();
        genLetter();
    }
    
    public void prepare()
    {
        //Borders
        obj_Border obj_border = new obj_Border();
        addObject(obj_border, 50, 400);
        obj_Border obj_border2 = new obj_Border();
        addObject(obj_border2, 550, 400);
        //Character
        obj_Char obj_char = new obj_Char();
        addObject(obj_char, 300, 200);
    }
    
    public void genLetter()
    {
        int randNumber = Greenfoot.getRandomNumber(5);
        obj_letterBox obj_letterbox = new obj_letterBox();
        addObject(obj_letterbox, 400, 800);
    }
}
