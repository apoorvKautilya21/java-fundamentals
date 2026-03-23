class BankAccount {
  private String accountHolderName;
  private double balance;

  BankAccount(String name, double bal) {
    this.accountHolderName = name;
    this.balance = bal;
  }

  double getBalance() {
    return balance;
  }

  String getAccountHolderName() {
    return accountHolderName;
  }

  void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }
  
  void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else if (amount > balance) {
      System.out.println("Insufficient funds for withdrawal.");
    } else {
      System.out.println("Withdrawal amount must be positive.");
    }
  }
};

public class Encapsulation {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("Alice", 1000.0);
    
    System.out.println("Account Holder: " + account.getAccountHolderName());
    System.out.println("Initial Balance: " + account.getBalance());

    account.deposit(500.0);
    System.out.println("Balance after deposit: " + account.getBalance());
    account.withdraw(200.0);
    System.out.println("Balance after withdrawal: " + account.getBalance());
  }
}
