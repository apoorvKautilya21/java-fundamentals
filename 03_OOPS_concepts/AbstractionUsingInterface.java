interface Shape {
  void draw();
  void resize();

  default void rotate(String shapeName) { // can be overridden
    System.out.println("Rotating the " + shapeName);
  }

  static void info() {
    System.out.println("This is a shape interface");
  }
}

class Circle implements Shape {
  public void draw() {
    System.out.println("Drawing a circle");
  }

  public void resize() {
    System.out.println("Resizing the circle");
    rotate("circle");
  }
}

class Square implements Shape {
  public void draw() {
    System.out.println("Drawing a square");
  }

  public void resize() {
    System.out.println("Resizing the square");
  }

  public void rotate() {
    System.out.println("Rotating the square");
  }

  @Override
  public void rotate(String shapeName) {
    System.out.println("Rotating the " + shapeName);
  }
}

public class AbstractionUsingInterface {
  public static void main(String[] args) {
    Shape circle = new Circle();
    circle.draw();
    circle.resize();
    circle.rotate("circle"); // using default method

    // Circle.info(); // static method from interface
    Shape.info(); // static method from interface

    Shape square = new Square();
    square.draw();
    square.resize();
    square.rotate("square");
  }
}
