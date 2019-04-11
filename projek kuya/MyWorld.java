;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new scorebanana(),70,40);
        addObject(new turtle(),20,100);
        addObject(new banana(),20,200);
        addObject(new banana(),100,40);
        addObject(new banana(),890,100);
        addObject(new banana(),990,100);
        addObject(new banana(),390,100);
        addObject(new kalah(),190,100);
        addObject(new bola(),590,100);
        
    }
    }
    
    
    

