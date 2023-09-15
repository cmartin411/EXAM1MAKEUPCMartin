
public class MarriedSeparatelyTaxBracket extends TaxBracket{
    public MarriedSeparatelyTaxBracket(double lowerRange, double upperRange, double taxRate) {
        super(lowerRange, upperRange, taxRate);
    }
    
    public double calculateTax(double taxableIncome) {
        return super.calculateTax(taxableIncome); // Use the separate filing status tax calculation
    }
}