class Employee5 {
  String name;
  int age;

  Employee5() {
    this.name = "Default Name";
    this.age = 0;
  }

  Employee5(Employee5 emp) {
    this.name = emp.name;
    this.age = emp.age;
  }

  Employee5(String name) {
    this.name = name;
    this.age = 0; // Default age
  }

  Employee5(int age) {
    this.name = "Default Name"; // Default name
    this.age = age;
  }

  Employee5(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

public class ConstructorsThird {
  public static void main(String[] args) {
    Employee5 emp1 = new Employee5("Alice", 25);
    Employee5 emp2 = new Employee5(emp1); // Using copy constructor
    Employee5 emp3 = new Employee5("Bob"); // Using constructor with name
    Employee5 emp4 = new Employee5(30); // Using constructor with age
    Employee5 emp5 = new Employee5(); // Using default constructor

    emp1.display();
    emp2.display();
    emp3.display();
    emp4.display();
    emp5.display();
  }
}
