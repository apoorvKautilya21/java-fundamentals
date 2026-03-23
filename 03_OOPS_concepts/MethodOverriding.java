class ParentMethodOverr {
  void display() {
    System.out.println("Display method in ParentMethodOverr class");
  }

  void displayPrivate() {
    System.out.println("Display method in ParentMethodOverr class");
  }
}

class ChildMethodOverr extends ParentMethodOverr {
  @Override
  void display() {
    System.out.println("Display method in ChildMethodOverr class");
  }

  // This method is not overridden
  // Because it is private
  // attempting to assign weaker access privileges
  // private void displayPrivate() {
  //   System.out.println("Display method in ChildMethodOverr class");
  // }
}

public class MethodOverriding {
  public static void main(String[] args) {
    ParentMethodOverr parent = new ParentMethodOverr();
    ChildMethodOverr child = new ChildMethodOverr();

    parent.display();
    child.display();
    child.displayPrivate(); // This will call the parent's private method

    System.out.println();

    ParentMethodOverr child2 = new ChildMethodOverr();
    child2.display(); // This will call the overridden method in ChildMethodOverr
    child2.displayPrivate(); // This will call the parent's private method

    ParentMethodOverr[] arr = {parent, child, child2};

    for (ParentMethodOverr obj : arr) {
      obj.display();
      obj.displayPrivate();
    }
  }
}
