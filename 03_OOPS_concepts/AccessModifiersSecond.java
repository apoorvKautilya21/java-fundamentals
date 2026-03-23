// Outside classes cannot be assigned protected access modifiers
// protected class Abc {
//   void display() {
//     System.out.println("Display method in Student class");
//   }
// }

class ParentNew {
  protected class InsideClass {
    public void display() {
      System.out.println("Display method in InsideClass");
    }
  }
  protected void display() {
    InsideClass inside = new InsideClass();
    inside.display();
    System.out.println("Display method in Parent class");
  }
}

class Child extends ParentNew {
  void displayChild() {
    // Since Child extends Parent, we can access the protected nested class
    InsideClass inside = new InsideClass();
    inside.display();
    System.out.println("Display method in Child class");
  }
}

public class AccessModifiersSecond {
  public static void main(String[] args) {
    Child child = new Child();
    child.displayChild();
  }
}
