// Parameterized constructor
class Employee {
  String name;
  int age;

  // Constructor with parameters
  Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Method to display employee details
  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

// Since Employee2 does not have a constructor defined,
// Java provides a default constructor that initializes the object.
// This is an example of a class without a constructor.
// It can be instantiated without any parameters.
class Employee2 {
  void display() {
    System.out.println("Hello from Student 2");
  }
}

class Employee3 {
  String name;
  int age;

  // Default constructor
  Employee3() {
    this.name = "Default Name";
    this.age = 0;
  }

  // Method to display employee details
  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

// Copy constructor
class Employee4 {
  String name;
  int age;

  Employee4(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Employee4(Employee4 emp) {
    this(emp.name, emp.age);
  }  

  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

public class ConstructorsSecond {
  public static void main(String[] args) {
    Employee emp1 = new Employee("APK", 24);
    emp1.display();

    Employee2 emp2 = new Employee2();
    emp2.display();

    Employee3 emp3 = new Employee3();
    emp3.display();

    Employee4 emp4 = new Employee4("John", 30);
    Employee4 emp5 = new Employee4(emp4); // Using copy constructor

    emp4.display();
    emp5.display();
  }
}
