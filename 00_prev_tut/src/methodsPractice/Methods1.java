package methodsPractice;

public class Methods1 {
  
  public static void main(String[] args) {
    greet();

    int arr[] = new int[4];
    arr[0] = arr[1] = arr[2] = arr[3] = 12;
    arr[3] += 2;

    System.out.println(findAvg(arr));
  }

  public static void greet() {
    System.out.println("Hello");
  }

  public static double findAvg(int nums[]) {
    double avg = 0.0;

    for (int number : nums) {
      avg += number;
    }

    return avg / nums.length;
  }
}
