import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter shub = new BackgroundPainter();

    shub.setPaint(16*16);
    shub.paintBackground("white");
    

    CreeperFace shubie = new CreeperFace(1, 1, "north", 225);

    //first time filling in
    shubie.paintGreen("green");
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //second time filling in
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //third time filling in
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //fourth time filling in
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //fifth time filling in
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //sixth time filling in
    shubie.turnRight();
    shubie.move();
    shubie.turnRight();
    shubie.paintToFillGreen("green");
    shubie.turnLeft();
    shubie.move();
    shubie.turnLeft();
    shubie.paintToFillGreen("green");

    //moves second painter to the bottom left corner
    shubie.moveToEnd();

    //insantiate a new painter class called CreeperEyes which paints the creepers eyes
    CreeperEyes shubby = new CreeperEyes(2, 3, "east", 50);

    //paints the painters eyes 
    shubby.paintEyes("black");
    shubby.paintEyes("black");
    shubby.paintEyes("black");
    shubby.paintEyes("black");

    //fills in the first eye with black 
    shubby.move();
    shubby.turnRight();
    shubby.move();
    shubby.paint("black");
    shubby.move();
    shubby.paint("black");
    shubby.turnLeft();
    shubby.move();
    shubby.paint("black");
    shubby.turnLeft();
    shubby.move();
    shubby.paint("black");

    //fills the eye with red on the bottom right corner
    shubby.turnAround();
    shubby.move();
    shubby.paint("red");
    shubby.move();
    shubby.paint("red");
    shubby.turnLeft();
    shubby.move();
    shubby.paint("red");
    shubby.turnLeft();
    shubby.move();
    shubby.paint("red");
    shubby.moveToEnd();

    /* this calls for a new painter and now a new method is being used
     I set up the painter with 50 paint */ 
    CreeperEyes eyes = new CreeperEyes(13, 3, "west", 50);

    eyes.paintOtherEye("black");
    eyes.paintInside("black");
    eyes.paintOtherInside("red");
    eyes.moveToEnd();

    /*I set up a new subclass of the PainterPlus 
     I fully painted the creepers mouth and then we are finished 
     */
    CreeperMouth sam = new CreeperMouth(6, 7, "south", 8);

    sam.paintLine("black");
    sam.setPaint(4*2);
    sam.moveTo();
    sam.paintLine("black");
    sam.moveTo();
    sam.turnLeft();
    sam.setPaint(7*2);
    sam.paintMouth("black");
    sam.moveFast();
    sam.turnRight();
    sam.moveFast();
    
  }
}