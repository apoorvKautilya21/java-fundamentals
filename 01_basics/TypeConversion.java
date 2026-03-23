public class TypeConversion {
  
  public static void main(String[] args) {
    int intValue = 100;
    double doubleValue = intValue; // Implicit conversion from int to double
    System.out.println("Implicit conversion from int to double: " + doubleValue);

    // Double to int conversion will not be implicit
    // It requires explicit casting
    // This is because double can hold larger values than int
    // and can also hold decimal values, which int cannot.
    // Hence, we need to explicitly convert it to avoid data loss.
    // If we don't cast, it will result in a compilation error.

    double anotherDoubleValue = 9.78;
    int anotherIntValue = (int) anotherDoubleValue; // Explicit conversion from double to int
    System.out.println("Explicit conversion from double to int: " + anotherIntValue);
  }
}
