
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("Down")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("up")){
            move(5);
            

        }
                if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
            

        }
        Actor banana = getOneObjectAtOffset(0,0,banana.class);
        if(banana !=null){
            getWorld().removeObject(banana);
            scorebanana.banana++;
            
            
          
    }
    if(scorebanana.banana == 4){
        getWorld().addObject(new menang(), 300, 200);
        Greenfoot.stop();
    }
}
}

