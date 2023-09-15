
public class TaxBracket{
   private double lowerRange;
   private double upperRange;
   private double taxRate;
   private double taxAmount;
  
   public TaxBracket(double lowerRange, double upperRange, double taxRate) {
      this.lowerRange = lowerRange;
      this.upperRange = upperRange;
      this.taxRate = taxRate;
      this.taxAmount = (upperRange - lowerRange) * taxRate + 0.5 * (upperRange - lowerRange);
   }
  
   public double calculateTax(double taxableIncome) {
      return taxableIncome >= lowerRange && taxableIncome < upperRange ? (taxableIncome - lowerRange) * taxRate + 0.5 * (taxableIncome - lowerRange) : taxAmount;
   }
}
