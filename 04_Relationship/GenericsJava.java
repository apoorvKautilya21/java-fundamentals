import java.util.ArrayList;

class StackCustom <T> {
  private ArrayList <T> list;

  StackCustom() {
    list = new ArrayList<>();
  }

  void push(T val) {
    list.add(val);
  }

  void pop() {
    if (!list.isEmpty()) {
      list.remove(list.size() - 1);
    } else {
      System.out.println("Stack is empty");
    }
  }

  T top() {
    if (!list.isEmpty()) {
      return list.get(list.size() - 1);
    } else {
      System.out.println("Stack is empty");
      return null;
    }
  }
}

class GenericMethodExample {
  public <T> void printArray(T[] array) {
    for (T element : array) {
      System.out.println(element);
    }
  }

  public static <T extends Number> T getSum(T[] array) {
    return array[0];
  }
}

public class GenericsJava {
  public static void main(String[] args) {
    StackCustom<Integer> stack = new StackCustom<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Top element is: " + stack.top());
    stack.pop();
    System.out.println("Top element is: " + stack.top());

    Double ans = GenericMethodExample.getSum(new Double[]{1.0, 2.0, 3.0});
    System.out.println("Sum is: " + ans);

    // Not possible as type should be subclass of Number class
    // String strAns = GenericMethodExample.getSum(new String[]{"Hello", " ", "World"});
    // System.out.println("Concatenated String is: " + strAns);

    StackCustom stackRaw = new StackCustom();
    stackRaw.push(10);
    stackRaw.push("Hello");
    stackRaw.push(3.14);

    System.out.println("Top element is: " + stackRaw.top());
  }
}
