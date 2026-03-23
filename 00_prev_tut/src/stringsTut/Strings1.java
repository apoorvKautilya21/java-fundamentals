package stringsTut;

public class Strings1 {
  public static void main(String[] args) {
    String name1 = "Apoorv";
    String name2 = new String("Apoorv");
    String name3 = "Apoorv";

    System.out.println(name1);
    System.out.println(name2);

    if (name1 == name2) System.out.println("Equal strings");
    else System.out.println("Not equal");

    if (name1 == name3) System.out.println("Equal strings");
    else System.out.println("Not equal");

    if (name1.equals(name2)) System.out.println("Equal strings");
    else System.out.println("Not equal");


  }
}
