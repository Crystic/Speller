import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

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
        collision();
        if(!collision)
        {
            moveObjVert();
        }
    }    

    boolean collision = false;
    public String thisLetter;
    static int FONTHEIGHT = 16;
    static int FONTWIDTH = 8;
    
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
            collision = true;
            getWorld().removeObject(this);
        }
        else
        {
            collision = false;
        }
    }
    
    public obj_letterBox(String letter)
    {
        thisLetter = letter;
        setLetterText();        
    }

    private void setLetterText(){
        setImage("obj_letterBox.png");  
        GreenfootImage image = getImage();        //get the image to work with
        Font AFont = new Font("Calibri", 1, FONTHEIGHT);    //set font to Arial, bold, size 16
        image.setFont(AFont);
        image.setColor(new Color(0,0,0));         //set font colour to black
        centreText(thisLetter, image);
    }

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
    
    public int getLetterWidth()
    {
        GreenfootImage thisImage = getImage();
        return thisImage.getWidth();
    }
   
    public String getLetterText()
    {
        return thisLetter;
    }
    
    public void setLetterText(String letter)
    {
       thisLetter = letter;
    }  
}
