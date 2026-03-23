class Parent {
  private int privateVar = 10;
  private void privateMethod() {
    System.out.println("Private Method in Parent");
  }

  public void publicMethod() {
    privateMethod();
    System.out.println("Public Method in Parent " + privateVar);
  }
};

// INVALID
// private class Random {

// };

class Student {
  private class InsideClass {
    public void display() {
      System.out.println("Inside InsideClass");
    }
  };

  public void createInsideClass() {
    InsideClass inside = new InsideClass();
    inside.display();
  }
};

public class AccessModifiersFirst {
  public static void main(String[] args) {
    Parent parent = new Parent();

    // parent.privateMethod(); // This line will cause a compile-time error
    parent.publicMethod(); // This will work

    Student student = new Student();
    student.createInsideClass();
  }
}
