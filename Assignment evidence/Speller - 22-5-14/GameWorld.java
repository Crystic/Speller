import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

public class GameWorld extends World
{    
    long lastAdded= System.currentTimeMillis();
    
    public void act()
    {
        long currTime = System.currentTimeMillis();
        if(currTime >= lastAdded + 2000)
        {
            int x = Greenfoot.getRandomNumber(450);          
                        
            if( x >= 150 && x <= 450)
            {
                addObject(new obj_letterBox("C"), x, 800);
            }
            lastAdded = currTime;
        }
    }
    
    
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        prepare();
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
    
    public void wordHandler()
    {
        String currentWord;
        
        
        String[] words =
        {
            "Cat",
            "Dog",
            "Pig"
        };
        
        
    }
}
