import java.util.Scanner;

class Basics {
  public static void main(String[] args) {
    char letter = 'A';
    int a = 1;
    Integer b = 2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Character: " + letter);
    System.out.println("Primitive int: " + a);
    System.out.println("Wrapper Integer: " + b);

    String name = "John";
    name += " Doe";
    System.out.println("Full name: " + name);

    System.out.println(name.charAt(5));
    System.out.println(name.substring(5, 7));

    System.out.println("Enter your name: ");
    String inputNameWithSpaces = scanner.nextLine(); // Spaces are allowed

    System.out.println(inputNameWithSpaces);

    double d = scanner.nextDouble();
    System.out.println(d);

    String firstName = scanner.next(); // Reads until space
    String lastName = scanner.next();
    System.out.println(firstName + " " + lastName);

    scanner.close();
  }
}

/**

********* int (Primitive Type): *********
- int is one of Java's eight primitive data types.
- It directly stores the integer value in memory.
- It is more memory-efficient and generally faster for direct numerical operations.
- It cannot be null; it always holds a default value of 0 if not explicitly initialized.
- It does not have methods or properties like an object.


********* Integer (Wrapper Class): ********* 
- Integer is a class in the java.lang package, known as a "wrapper class" for int.
- It encapsulates an int value within an object.
- It consumes more memory and can be slightly slower for direct numerical operations compared to int due to object overhead.
- It can be null, which is useful for representing the absence of a value, particularly when interacting with databases or handling optional data.
- Being an object, Integer provides various methods for operations like converting to different number bases (binary, octal, hexadecimal), parsing strings, and comparing values using the equals() method.
- It is required when working with Java Collections (like ArrayList, HashMap) because these collections can only store objects, not primitive types.
- Autoboxing and unboxing automatically convert between int and Integer in many contexts, simplifying their use.
*/