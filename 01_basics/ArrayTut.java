public class ArrayTut {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Array length: " + numbers.length);
    System.out.println("First element: " + numbers[0]);

    int[] moreNumbers = new int[5];
    moreNumbers[0] = 10; // Initializing elements
    moreNumbers[1] = 20;
    moreNumbers[2] = 30;
    moreNumbers[3] = 40;
    moreNumbers[4] = 50;

    System.out.println("Second array, first element: " + moreNumbers[0] + " length: " + moreNumbers.length);

    int [][] twoDArray = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    System.out.println("Two-dimensional array, first element: " + twoDArray[0][0]);

    int [][] another2DArray = new int[3][3];
    another2DArray[0][0] = 99;

    System.out.println("Another 2D array, first element: " + another2DArray[0][0]);
    System.out.println("Another 2D array, length: " + another2DArray.length);
    System.out.println("Another 2D array, first row length: " + another2DArray[0].length);

  }

}
