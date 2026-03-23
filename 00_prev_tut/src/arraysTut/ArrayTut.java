public class ArrayTut {

  public static void main(String[] args) {
    int arr1[] = new int[4];
    int arr2[] = {1, 2, 4};
    int arr3[][] = new int[3][4];
    int arr4[][] = {
      {1, 3, 4},
      {10, 12, 12}
    };

    System.out.println(arr4[0][2]);

    String names[] = {"Apoorv", "Kunal", "Bitlee"};

    for (String name : names) {
      System.out.println(name);
    }

    double avg = 0.0;
    for (int i = 0; i < arr4.length; i++) {
      for (int j = 0; j < arr4[0].length; j++) {
        avg += arr4[i][j];
      }
    }

    System.out.println(avg);

    avg = avg / (arr4.length * arr4[0].length);

    System.out.println(avg);
  }


}