import java.util.Scanner;

public class WhileLoop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean hasLearnt = false;

    while (!hasLearnt) {
      System.out.println("He hasn't learnt yet");
      System.out.println("Learnt now ?");

      hasLearnt = sc.nextBoolean();
    }

    sc.close();
  }
  
}
