public class LabelledForLoop {
  public static void main(String[] args) {
    OuterLoop:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 2) break OuterLoop;
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }
}