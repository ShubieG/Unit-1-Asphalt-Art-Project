import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  public PainterPlus(int x, int y, String dir, int num) {
      super(x, y, dir, num);
    }
  //more method to add here on Tuesday
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  public void paintToEmpty(String color) {
    while (hasPaint()) {
    paint(color);
    move();
    }
  }

  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  public void moveToEnd() {
    moveFast();
    turnRight();
    moveFast();
    turnRight();
    moveFast();
  }
 
}