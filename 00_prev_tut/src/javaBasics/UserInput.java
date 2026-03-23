import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age");
    String age = sc.nextLine();

    System.out.println("The age is " + age);

    sc.close();
  }
  
}
