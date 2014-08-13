import greenfoot.*;  
import java.awt.Font;
import java.awt.Color;
import java.util.List;

/**
 * Write a description of class obj_letterBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obj_letterBox extends Actor
{
    public void act() 
    {   
        //Activates collision method.
        collision();
        //Checks boolean collision to be false.
        if(!collision)
        {
            //If it is false, run method moveObjVert.
            moveObjVert();
        }
    }    

    //Collision boolean.
    public boolean collision = false;
    //Stores the current letter.
    public String thisLetter;
    //Font height.
    static int FONTHEIGHT = 16;
    //Font width.
    static int FONTWIDTH = 8;

    //Moves the object verically.
    public void moveObjVert()
    {
        setLocation(getX(), getY()-5);
        //If the object gets to Y=0, remove the object.
        if(getY() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    //Collision checking & Letter actor placement.
    public void collision()
    {
        //Object it will check collisions for.
        Actor Character = getOneIntersectingObject(obj_Char.class);
        //Dummy actors used for letters.
        letterOne letterone = new letterOne();
        letterTwo lettertwo = new letterTwo();
        letterThree letterthree = new letterThree();
        
        //Counts the collisions to produce correct letter images.
        int collisionCount = ((GameWorld)getWorld()).getCollisionCount();
        
        //Checks for collision.
        if(Character != null)
        {
            //Sets boolean to true.
            collision = true;
            //If collisionCount is 1
            if(collisionCount == 1)
            {
                //Add object letterone at coordinates to the world.
                ((GameWorld)getWorld()).addObject(letterone, 200, 100);
            }
            //Same as above but one letter further.
            if (collisionCount == 2)
            {
                ((GameWorld)getWorld()).addObject(lettertwo, 250, 100);
            }
            //Same as above but one letter further.            
            if (collisionCount == 3)
            {
                ((GameWorld)getWorld()).addObject(letterthree, 300, 100);
            }
            
            //Once the letter has been added to the world, move onto the next letter.
            ((GameWorld)getWorld()).moveToNextLetter();
            //Add to collision count.
            ((GameWorld)getWorld()).addToCollCount();
            //Finally remove the object from the world.
            getWorld().removeObject(this);
        }
        else
        {
            //If no collision, collision = false
            collision = false;
        }
        

    }
    
    //Used to place text on the object.
    public obj_letterBox(String letter)
    {
        thisLetter = letter;
        setLetterText();        
    }
    //Used to place text on the object.
    private void setLetterText(){
        setImage("obj_letterBox.png");  
        GreenfootImage image = getImage();        //get the image to work with
        Font AFont = new Font("Calibri", 1, FONTHEIGHT);    //set font to Arial, bold, size 16
        image.setFont(AFont);
        image.setColor(new Color(255,250,250));         //set font colour to black
        centreText(thisLetter, image);
    }
    //Used to center text on the object.
    private void centreText(String theText, GreenfootImage theImage)
    {
        if(theText !="")
        {
            int textLength = theText.length() * FONTWIDTH;
            int XPos = theImage.getWidth()/2 - textLength/2;
            int Ypos = theImage.getHeight()/2 + FONTHEIGHT/2 - 4;
            theImage.drawString(theText,XPos, Ypos);
        }
    }
    //Used to get object width.
    public int getLetterWidth()
    {
        GreenfootImage thisImage = getImage();
        return thisImage.getWidth();
    }
    //Gets the letter text.
    public String getLetterText()
    {
        return thisLetter;
    }
    //Sets the text on the object to the letter.
    public void setLetterText(String letter)
    {
       thisLetter = letter;
    }  
}
