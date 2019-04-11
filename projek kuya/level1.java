import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        banana banana = new banana();
        addObject(banana,535,58);
        banana banana2 = new banana();
        addObject(banana2,533,342);
        banana banana3 = new banana();
        addObject(banana3,534,200);
        turtle turtle = new turtle();
        addObject(turtle,54,215);
        bola bola = new bola();
        addObject(bola,314,211);
        scorebanana scorebanana = new scorebanana();
        addObject(scorebanana,238,57);
        removeObject(scorebanana);
        banana banana4 = new banana();
        addObject(banana4,303,59);
    }
}
