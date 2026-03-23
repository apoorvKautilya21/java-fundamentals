abstract class Car {
  abstract void start();

  Car(String name) {
    System.out.println(name + " is being created");
  }

  void noise() {
    System.out.println("Car is making noise");
  }
}

abstract class Dealer extends Car {
  Dealer() {
    super("Dealer Car");
  }
  abstract void sell();
}

class ManualCar extends Car {
  ManualCar() {
    super("Manual Car");
  }
  @Override
  void start() {
    System.out.println("Starting manual car");
  }

  void manualFeature() {
    System.out.println("Manual car has a manual transmission");
  }
}

class AutomaticCar extends Dealer {
  @Override
  void start() {
    System.out.println("Starting automatic car");
  }

  @Override
  void sell() {
    System.out.println("Selling automatic car");
  }

  void noise() {
    System.out.println("Automatic car doesn't make noise");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    // Dealer car = new Dealer(); // Cannot instantiate abstract class
    Car manualCar = new ManualCar(); // more preferred usually
    ManualCar manualCar2 = new ManualCar();

    manualCar.start(); // Starting manual car
    manualCar.noise(); // Car is making noise
    // manualCar.manualFeature(); // Won't be able to access manualFeature() because manualCar is of type Car

    manualCar2.start();
    manualCar2.noise(); // Car is making noise
    manualCar2.manualFeature(); // Manual car has a manual transmission

    Dealer automaticCar = new AutomaticCar();
    automaticCar.start(); // Starting automatic car
    automaticCar.noise(); // Automatic car doesn't make noise
    automaticCar.sell(); // Selling automatic car
  }
}
