
public class MarriedJointlyTaxBracket extends TaxBracket{
    public MarriedJointlyTaxBracket(double lowerRange, double upperRange, double taxRate) {
        super(lowerRange, upperRange, taxRate);
    }
    
    public double calculateTax(double taxableIncome) {
        return super.calculateTax(taxableIncome); // Use the joint filing status tax calculation
    }
}