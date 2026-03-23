class RectangleLCPBad {
  public double width;
  public double height;

  public double getArea() {
    return width * height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}

class SquareLCPBad extends RectangleLCPBad {
  @Override
  public void setWidth(double width) {
    this.width = width;
    this.height = width; // Ensures height is always equal to width
  }

  @Override
  public void setHeight(double height) {
    this.height = height;
    this.width = height; // Ensures width is always equal to height
  }
}

public class LSP2BadExample {
  public static double getAreaUtil(RectangleLCPBad rectangle) {
    rectangle.setHeight(5);
    rectangle.setWidth(4);

    return rectangle.getArea();
  }

  public static void main(String[] args) {
    RectangleLCPBad square = new SquareLCPBad();

    System.out.println(getAreaUtil(square));

  }
  
}
