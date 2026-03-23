
class BankAccount {
  private String name;
  private double balance;

  BankAccount(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public void displayMessage() {
    System.out.println("Hello from BankAccount!");
  }

  public void displayAccountInfo() {
    System.out.println("Account Holder: " + name);
    System.out.println("Balance: $" + balance);
  }
}

public class BasicsFirst {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("John Doe", 1000.0);
    account.displayAccountInfo();
    // account.name = "Jane Doe"; // This line will cause a compilation error because 'name' is private
  }
}
