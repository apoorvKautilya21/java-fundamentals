class MyClass implements Cloneable {
  public String name;
  public String description;

  MyClass(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class ShallowCloning implements Cloneable {
  MyClass myClass;
  public String additionalInfo;

  ShallowCloning(MyClass myClass, String info) {
    this.myClass = myClass;
    this.additionalInfo = info;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class DeepCloning implements Cloneable {
  MyClass myClass;
  public String additionalInfo;

  DeepCloning(MyClass myClass, String info) {
    this.myClass = myClass;
    this.additionalInfo = info; 
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    DeepCloning cloned = (DeepCloning) super.clone();
    cloned.myClass = (MyClass) myClass.clone();
    return cloned;
  }
}

public class ObjectCloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    ShallowCloning original = new ShallowCloning(new MyClass("Original", "This is the original object"), "Some additional info");

    ShallowCloning copy = (ShallowCloning) original.clone();

    copy.myClass.name = "Copy"; // Modifying the name in the copy
    System.out.println("Original: " + original.myClass.name); // Copy
    System.out.println("Copy: " + copy.myClass.name); // Copy

    DeepCloning deepCloning = new DeepCloning(new MyClass("Original", "This is the original object"), "Some additional info");
    DeepCloning deepCloningCopy = (DeepCloning) deepCloning.clone();

    deepCloningCopy.myClass.name = "Copy";
    System.out.println("Deep Cloning Original: " + deepCloning.myClass.name); // Original
    System.out.println("Deep Cloning Copy: " + deepCloningCopy.myClass.name); // Copy
  }
}
