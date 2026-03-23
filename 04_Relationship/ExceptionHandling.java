class SelfMadeException extends Exception {
  SelfMadeException(String message) {
    super(message);
    System.out.println("SelfMadeException occurred: " + message);
  }
}

class DemoException {
  public void display(int x) throws Exception {
    if (x == 5) {
      throw new Exception("Demo exception");
    }
  }

  // If another function uses display
  // then either throw the exception or handle it using try-catch
  public void display2(int x) throws Exception {
    display(x);
  }

  public void display3(int x) {
    try {
      display(x);
    } catch (Exception e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
  }

  // No need to throw exception because this is a runtime exception
  public void runTimeException() {
    int x = 100 / 0;
  }

  public void selfMadeExceptionThrowerMethod() throws SelfMadeException {
    throw new SelfMadeException("New Exception");
  }
}

public class ExceptionHandling {
  public static void main(String[] args) {
    try {
      // Code that may throw an exception
      int result = 10 / 0; // This will throw ArithmeticException
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("This block always executes.");
    }

    try {
      // Code that may throw another exception
      String str = null;
      System.out.println(str.length()); // This will throw NullPointerException
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      // for general exceptions
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("This block also always executes.");
    }

    try {
      throw new SelfMadeException("null pointer exception");
    } catch (SelfMadeException e) {
      System.out.println("Caught self-made exception: " + e.getMessage());
    }

  }
}
