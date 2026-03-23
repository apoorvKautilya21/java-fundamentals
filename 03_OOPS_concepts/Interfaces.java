interface CarInterface {
  void start();
  void stop();
  int doors = 4; // this is final variable, cannot be updated the subclasses
  // better to write like this
  static final int windShields = 2; // this is also a final variable

  // Interface cannot have a constructor
  // CarInterface() {
  //   // Constructor
  // }

  static void info() {
    System.out.println("This is a car interface");
  }
}

interface Sunroof {
  static final int sunroof = 1;

  public void openSunroof();
}

class ManualCarFromInt implements CarInterface, Sunroof {
  ManualCarFromInt() {
    // Constructor
    // doors = 1; // this cannot be updated
  }

  public void openSunroof() {
    System.out.println("Opening sunroof");
  }

  public int getWindShields() {
    return windShields;
  }

  public void doorManual() {
    System.out.println("Manual car has " + doors + " doors.");
  }

  public void start() {
    System.out.println("Starting manual car");
  }

  public void stop() {
    System.out.println("Stopping manual car");
  }

  public void getInfo(String carType) {
    CarInterface.info(); // static method from interface
    System.out.println("Car Type: " + carType);
  }
}

public class Interfaces {
  public static void main(String[] args) {
    ManualCarFromInt manualCar = new ManualCarFromInt();
    manualCar.start();
    manualCar.stop();
    manualCar.getInfo("Manual Car");
    System.out.println("Number of doors: " + CarInterface.doors);
    System.out.println("Number of windshields: " + manualCar.getWindShields());
  }
}