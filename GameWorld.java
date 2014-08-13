import greenfoot.*;
import java.util.Date;

public class GameWorld extends World
{    
    long lastAdded= System.currentTimeMillis();   
    String currentWord;
    public int wordNum = Greenfoot.getRandomNumber(3);
    public int letterNum = 0;
    public int collisionCount = 1;
    
    public void act()
    {
        long currTime = System.currentTimeMillis();
        String thisLetter = "";
        
        if(letterNum == 3)
        {
            thisLetter = currentWord.substring(letterNum);
        }
        else
        {
            thisLetter = currentWord.substring(letterNum, letterNum+1);
        }
        
        if ((currTime >= lastAdded + 2000) && (collisionCount <= 3))
        {
            int randX = Greenfoot.getRandomNumber(450);          
                        
            if( randX >= 150 && randX <= 450)
            {
                addObject(new obj_letterBox(thisLetter), randX, 800);
            }
            lastAdded = currTime;
        }
    }
    
    public GameWorld()
    {    
        super(600, 800, 1);
        prepare();
        currentWord = wordHandler();
        act();
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
    
    public String wordHandler()
    {       
        String[] words =
        {
            "Cat",
            "Dog",
            "Pig"
        };
        return words[wordNum];   
    }
    
    public int moveToNextLetter()
    {
        int currentWordLength = currentWord.length();
        if(letterNum <= currentWordLength)
        {
            letterNum++;
        }
        return letterNum;
    } 
    
    public int getWordNum()
    {
        return wordNum;
    }
    
    public void addToCollCount()
    {
        collisionCount++;
    }
    
    public int getCollisionCount()
    {
        return collisionCount;
    }
}
