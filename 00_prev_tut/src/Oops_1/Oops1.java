package Oops_1;
import java.lang.Math;

public class Oops1 {
  public static void main(String[] args) {
    ComplexNumber c1 = new ComplexNumber(10, -5);
    ComplexNumber c2 = new ComplexNumber(8, 15);
    ComplexNumber c3 = new ComplexNumber(-8, 15);

    c1.add(c3);
    c1.show();

    c3.add(c2);
    c3.show();
  }
}

class ComplexNumber {
private
  int real;
  int img;

public
  ComplexNumber(int real, int img) {
    this.real = real;
    this.img = img;
  }

  void add(ComplexNumber b) {
    real += b.real;
    img += b.img;
  }

  void show() {
    boolean isNeg = img < 0;
    String number = real + (isNeg ? " - i" : " + i") + Math.abs(img);

    System.out.println(number);
  }
}