class CompileTimePolymorph {
  int add(int a, int b) {
    System.out.println("Adding integers");
    return a + b;
  }

  double add(double a, double b) {
    System.out.println("Adding doubles");
    return a + b;
  }

  void display() {
    System.out.println("Display method in CompileTimePolymorph class");
  }
}

class RunTimePolymorphism {
  void display() {
    System.out.println("Display method in RunTimePolymorphism class");
  }

  void display(int a) {
    System.out.println("Display method in RunTimePolymorphism class with int parameter: " + a);
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    CompileTimePolymorph obj = new CompileTimePolymorph();
    System.out.println("Sum of integers: " + obj.add(5, 10));
    System.out.println("Sum of doubles: " + obj.add(5.5, 10.5));

    RunTimePolymorphism runTimeObj = new RunTimePolymorphism();
    runTimeObj.display();
    runTimeObj.display(5);
  }
}
