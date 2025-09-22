import org.code.neighborhood.*;

public class CreeperMouth extends PainterPlus {
  public CreeperMouth(int x, int y, String dir, int num) {
      super(x, y, dir, num);
    }

  //paints the two lines that go to the bottom of the creepers mouth
  public void paintLine(String color) {
    while (hasPaint()){
      paintToEmpty(color);
    }
  }

  //this method moves the painter so it can start filling the mouth
  public void moveTo() {
     turnLeft();
    move();
    move();
    move();
    turnLeft();
    move();
  }

  /*this method fills the mouth
  it moves 8 sqaures */
  public void paintMouth(String color) {
    if (canMove()) {
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnRight();
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
}