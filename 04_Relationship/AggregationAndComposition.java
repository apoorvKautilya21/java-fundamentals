import java.util.ArrayList;

class Employee {
  public String name;
  public int age;
  public String id;

  Employee(String name, int age, String id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }
}

// Aggregation
class Department {
  ArrayList<Employee> employees;

  Department() {
    employees = new ArrayList<>();
  }

  void addEmployee(Employee emp) {
    employees.add(emp);
  }

  void displayEmployees() {
    for (Employee emp : employees) {
      System.out.println("Name: " + emp.name + ", Age: " + emp.age + ", ID: " + emp.id);
    }
  }
}

class Engine {
  public String type;
  public int horsepower;

  Engine(String type, int horsepower) {
    this.type = type;
    this.horsepower = horsepower;
  }
}

// Composiion
class CarCompostion {
  public String model;
  public Engine engine;

  CarCompostion(String model, String engineType, int horsepower) {
    this.model = model;
    engine = new Engine(engineType, horsepower);
  }

  void displayInfo() {
    System.out.println("Car Model: " + model);
    System.out.println("Engine Type: " + engine.type + ", Horsepower: " + engine.horsepower);
  }
}

public class AggregationAndComposition {
  public static void main(String[] args) {
    // Aggregation
    Department dept = new Department();
    Employee alice = new Employee("Alice", 30, "E001");
    Employee bob = new Employee("Bob", 25, "E002");
    dept.addEmployee(alice);
    dept.addEmployee(bob);
    dept.displayEmployees();

    // Composition
    CarCompostion car = new CarCompostion("Tesla Model S", "Electric", 1020);
    car.displayInfo();
  }
}
