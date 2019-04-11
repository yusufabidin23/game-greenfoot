

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scorebanana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scorebanana extends Actor
{
    /**
     * Act - do whatever the scorebanana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int banana = 0;
    public void act() 
    {
        GreenfootImage image = new GreenfootImage ("Jumlah banana = "+ banana, 36, Color.RED, null);
        setImage(image);
       
       
       
    }    
}
