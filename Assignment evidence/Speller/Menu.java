import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //Borders
        obj_Border obj_border = new obj_Border();
        addObject(obj_border, 50, 400);
        obj_Border obj_border2 = new obj_Border();
        addObject(obj_border2, 550, 400);
        //Title
        spr_Speller spr_speller = new spr_Speller();
        addObject(spr_speller, 313, 104);
        spr_speller.setLocation(307, 84);
        //Buttons
        obj_btnPlay obj_btnplay = new obj_btnPlay();
        addObject(obj_btnplay, 300, 250);
        obj_btnHelp obj_btnhelp = new obj_btnHelp();
        addObject(obj_btnhelp, 300, 400);
        obj_btnQuit obj_btnquit = new obj_btnQuit();
        addObject(obj_btnquit, 300, 550);
    }
}
