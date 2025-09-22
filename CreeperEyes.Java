import org.code.neighborhood.*;

public class CreeperEyes extends PainterPlus {
  public CreeperEyes(int x, int y, String dir, int num) {
      super(x, y, dir, num);
    }

  //this method paints the eyes of the painter
  public void paintEyes(String color) {
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
  }

  //this method paints the other eye
  public void paintOtherEye(String color) {
    while (isFacingWest()) {
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      move();
      paint(color);
    }
  }

  //this method paints the inside of the first eye
  public void paintInside(String color) {
    if (canMove()) {
      turnLeft();
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnAround();
    }
  }
  //this method paints the inside of the second eye
  public void paintOtherInside(String color) {
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
  }

}