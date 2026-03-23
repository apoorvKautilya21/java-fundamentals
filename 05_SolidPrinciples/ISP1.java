interface PetBadExample {
  void feed();
  void groom();
}

class DogBad implements PetBadExample {
  @Override
  public void feed() {
    System.out.println("Feeding the dog");
  }

  @Override
  public void groom() {
    System.out.println("Grooming the dog");
  }
}

// We are forced to implement groom method for tiger to make the compiler happy
class TigerBad implements PetBadExample {
  @Override
  public void feed() {
    System.out.println("Feeding the tiger");
  }

  @Override
  public void groom() {
    throw new UnsupportedOperationException("Tigers don't need grooming");
  }
}

// GOOD EXAMPLE

interface AnimalGoodExample {
  void feed();
}

interface PetAnimal {
  void groom();
}

class DogGood implements AnimalGoodExample, PetAnimal {
  @Override
  public void feed() {
    System.out.println("Feeding the dog");
  }

  @Override
  public void groom() {
    System.out.println("Grooming the dog");
  }
}

class TigerGood implements AnimalGoodExample {
  @Override
  public void feed() {
    System.out.println("Feeding the tiger");
  }
}

public class ISP1 {
  
}
