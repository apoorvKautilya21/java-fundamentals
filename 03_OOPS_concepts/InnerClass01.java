import java.util.*;

class Outer01 {
  public static int staticVar = 5;
  private int instanceVar = 10;

  Outer01 () {
    System.out.println("Outer01 constructor called");
  }

  static class InnerStaticClass {
    void display() {
      System.out.println("Static variable from Outer01: " + staticVar);
      // System.out.println("Cannot access non-static variable from Outer01: " + instanceVar); // Error
    }
  }

  class InnerNonStaticClass {
    void display() {
      System.out.println("Instance variable from Outer01: " + instanceVar + " " + staticVar);
    }
  }

  void executeInner() {
    InnerStaticClass inner = new InnerStaticClass();
    inner.display();
  }

  void outerMethod() {
    final int finalVar = 1; // final variable
    int effictiveFinalVar = 2;
    int normalVar = 10;
    normalVar = 14;
    int normalVar2 = 100;

    class LocalInnerClass {
      void display() {
        System.out.println("Final variable: " + finalVar);
        System.out.println("Effective final variable: " + effictiveFinalVar);
        // System.out.println("Normal variable: " + normalVar); // Cannot access because this value is changed
        // System.out.println("Normal variable 2: " + normalVar2); // Cannot access because this value is changed
      }
    }

    normalVar2 = 200;
    LocalInnerClass localInner = new LocalInnerClass();
    localInner.display();
  }
}

interface SampleInterface {
  void anonymousInnerClassMethod();
}

public class InnerClass01 {
  public static void main(String[] args) {
    Outer01.InnerStaticClass inner = new Outer01.InnerStaticClass(); // Outer01 constructor will not be called
    inner.display();

    Outer01 outer01 = new Outer01(); // Outer01 constructor will be called
    outer01.executeInner();

    Outer01.InnerNonStaticClass innerNonStatic = outer01.new InnerNonStaticClass();
    innerNonStatic.display();

    outer01.outerMethod();

    SampleInterface outer012 = new SampleInterface() {
      public void anonymousInnerClassMethod() {
        System.out.println("Anonymous inner class method");
      }
    };

    outer012.anonymousInnerClassMethod(); // Calling method of anonymous inner class

    ArrayList <Integer> list = new ArrayList<>() {
      public boolean add(Integer e) {
        System.out.println("Adding element: " + e);
        return super.add(e);
      }
    };

    list.add(100);
    System.out.println(list.get(0));

  }
}
