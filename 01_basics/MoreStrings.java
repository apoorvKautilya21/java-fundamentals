public class MoreStrings {
  public static void main(String[] args) {
    String name1 = "Apoorv";
    String name2 = new String("Apoorv");
    String name3 = "Apoorv";

    System.out.println(name1);
    System.out.println(name2);

    // Comparing strings using '==' checks for reference equality
    // while 'equals()' checks for value equality.
    // Hence, name1 and name2 are not equal using '==' because they are different
    // objects in memory, but they are equal using 'equals()' because they have the
    // same content.
    // name1 and name3 are equal using both '==' and 'equals()' because
    // they refer to the same string literal in the string pool.
    // This is a common source of confusion for beginners in Java.
    // It's important to use 'equals()' for string content comparison.
    // Using '==' for string comparison can lead to unexpected results,
    // especially when dealing with strings created using the 'new' keyword.

    // Not equal because name1 and name2 are different objects
    // in memory, even though they have the same content.
    if (name1 == name2) System.out.println("Equal strings");
    else System.out.println("Not equal");
    
    // Equal because name1 and name3 refer to the same string literal
    // in the string pool, so they are the same object in memory.
    if (name1 == name3) System.out.println("Equal strings");
    else System.out.println("Not equal");

    // Equal because 'equals()' checks for content equality,
    // not reference equality.
    // This is the correct way to compare strings in Java.
    if (name1.equals(name2)) System.out.println("Equal strings");
    else System.out.println("Not equal");
  }
}
