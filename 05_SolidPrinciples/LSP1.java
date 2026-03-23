// BAD Example
class BirdBad {
  public void fly() {
    System.out.println("Flying");
  }
}

class SparrowFromBad extends BirdBad {
  public void eat() {
    System.out.println("Sparrow eating");
  }
}

class PenguinFromBad extends BirdBad {
  public void fly() {
    throw new UnsupportedOperationException("Penguins can't fly");
  }

  public void eat() {
    System.out.println("Penguin eating");
  }
}

// GOOD Example
class BirdGood {
  public void eat() {
    System.out.println("Bird eating");
  }
}

interface Flyable {
  void fly();
}

class SparrowFromGood extends BirdGood implements Flyable {
  public void fly() {
    System.out.println("Sparrow flying");
  }
}

class PenguinFromGood extends BirdGood {
  public void eat() {
    System.out.println("Penguin eating");
  }
}

public class LSP1 {
  public static void main(String[] args) {
    BirdBad sparrow = new SparrowFromBad();
    sparrow.fly();

    try {
      BirdBad penguin = new PenguinFromBad();
      penguin.fly();
    } catch (UnsupportedOperationException e) {
      System.out.println(e.getMessage());
    }
  }
}