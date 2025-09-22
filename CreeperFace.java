import org.code.neighborhood.*;

  public class CreeperFace extends PainterPlus {
    public CreeperFace(int x, int y, String dir, int num) {
      super(x, y, dir, num);
    }

    /* This paints the perimeter of the creepers face
    It's a ton of lines filled with code */
    public void paintStraight(String color) {
      if (canMove()) {
        turnRight();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
      }
    }

    //fills in the creepers face
    public void paintToFillGreen(String color) {
      if (canMove()) {
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
    }
  }

    /*this is the method to to just paint the border of the creepers face
     the paintStraight method is called 4 times bc
     we need to paint a sqaure */
    public void paintGreen(String color) {
      paintStraight(color);
      paintStraight(color);
      paintStraight(color);
      paintStraight(color);
    }
    
  }