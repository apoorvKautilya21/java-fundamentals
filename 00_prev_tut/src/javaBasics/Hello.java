// this is a block
public class Hello {
  public static void main(String[] args) {
    int $mark = 100;

    System.out.println("Marks is:" + $mark);

    boolean isPassed = 40 > 12;
    System.out.println("Is Passed:" + isPassed);

    if (isPassed && $mark < 50) {
      System.out.println("You have passed the exam.");
    } else {
      System.out.println("You have failed the exam.");
    }

    float pi = 3.14f;
    System.out.println("Pi is: " + pi);

    double e = 2.718281828459045;
    System.out.println("Euler's number is: " + e);

    char myLetter = '$';
    System.out.println("My letter is: " + myLetter);

    String myString = "Hello, world";
    System.out.println("My string is: " + myString);

    long countLong;
    int countInt;

    countInt = 100;
    countLong = 100;

    countInt = (int)countLong; // Explicit casting

    countInt = (int)countLong + 1;

    System.out.println("Count Int: " + countInt);
    System.out.println("Count Long: " + countLong);




  }
}