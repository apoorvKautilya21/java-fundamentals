class Demo1 {
  static {
    System.out.println("Static block in Demo1");
  }

  static {
    System.out.println("Static block in Demo1 - 2");
  }
}

class Demo11 {
  int a;
  int b;

  Demo11(int a, int b) {
    this.a = a;
    this.b = b;
  }

  int sum() {
    return a + b;
  }

  static int staticSum(int x, int y) {
    // System.out.println(sum()); // This will cause an error because 'sum' is not static
    // Non static methods cannot be called from static context
    return x + y;
  }

  int squareAndSum() {
    // static method can be called from non-static context
    int add = staticSum(200, 100);

    return add * add;
  }

}

public class Static01 {
  public static void main(String[] args) {
    new Demo1(); // This will trigger the static blocks
    System.out.println(Demo11.staticSum(10, 20));
  }
}
