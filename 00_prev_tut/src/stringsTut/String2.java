package stringsTut;

import java.util.Scanner;

public class String2 {

  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first name");
    // String firstName = sc.nextLine();
    // System.out.println("Enter last name");
    // String lastName = sc.next(); // Do not consider spaces

    // System.out.println(firstName + " " + lastName);

    String str = new String("Some string");
    System.out.println(str.charAt(2));

    int val = 134;
    String numeric = String.valueOf(val);

    System.out.println(str + numeric);

    String oldStr = "I love Java, Java is a great programming language";
    String curr = oldStr.replace("Java", "Cpp");

    System.out.println(oldStr);
    System.out.println(curr);

    char arr[] = oldStr.toCharArray();

    int a, b;

    a = 5; b = 10;
    System.out.println(a + b);



  }
  
}
