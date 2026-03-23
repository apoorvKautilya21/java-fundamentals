// BAD Design
// If we want to add for Russia then we will have to update the TaxFinder class
class TaxFinder {
  public double findTax(String region, double amount) {
    if (region.equalsIgnoreCase("India")) {
      return amount * 0.18; // GST in India
    } else if (region.equalsIgnoreCase("USA")) {
      return amount * 0.2; // Sales tax in USA
    } else if (region.equalsIgnoreCase("UK")) {
      return amount * 0.2; // VAT in UK
    }

    return amount;
  }
}

// GOOD Design
interface TaxCalculatorGood {
  double calculateTax(double amount);
}

class IndiaTaxCalculator implements TaxCalculatorGood {
  public double calculateTax(double amount) {
    return amount * 0.18; // GST in India
  }
}

class USATaxCalculator implements TaxCalculatorGood {
  public double calculateTax(double amount) {
    return amount * 0.2; // Sales tax in USA
  }
}

class UKTaxCalculator implements TaxCalculatorGood {
  public double calculateTax(double amount) {
    return amount * 0.2; // VAT in UK
  }
}

public class OCP1 {
  public static void main(String[] args) {
    TaxCalculatorGood indiaTax = new IndiaTaxCalculator();
    System.out.println("India Tax: " + indiaTax.calculateTax(10000));

    TaxCalculatorGood usaTax = new USATaxCalculator();
    System.out.println("USA Tax: " + usaTax.calculateTax(10000));

    TaxCalculatorGood ukTax = new UKTaxCalculator();
    System.out.println("UK Tax: " + ukTax.calculateTax(10000));
  }
}
