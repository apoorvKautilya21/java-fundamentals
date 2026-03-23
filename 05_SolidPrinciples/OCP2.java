interface Shape {
  double area();
}

class Square implements Shape {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double area() {
    return side * side;
  }
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}

public class OCP2 {
  public static void main(String[] args) {
    Shape square = new Square(5);
    System.out.println("Square Area: " + square.area());

    Shape circle = new Circle(3);
    System.out.println("Circle Area: " + circle.area());
  }
}
