import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letterThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class letterThree extends Actor
{
    /**
     * Act - do whatever the letterThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Runs setImage method.
        setImage();
    }
    
    //Changes the image on actor creation.
    public void setImage()
    {
        //Stores the wordNum from GameWorld.
        int wordNum = ((GameWorld)getWorld()).getWordNum();
        //Changes image depending on the wordNum.
        if(wordNum == 0)
        {
            setImage("T.png");
        }
        else if(wordNum == 1)
        {
            setImage("G.png");
        }
        else if(wordNum == 2)
        {
            setImage("G.png");
        }
    }
}
