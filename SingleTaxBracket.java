
public class SingleTaxBracket extends TaxBracket{
    public SingleTaxBracket(double lowerRange, double upperRange, double taxRate) {
        super(lowerRange, upperRange, taxRate);
    }
    
    public double calculateTax(double taxableIncome) {
        return super.calculateTax(taxableIncome) * 0.9; // Use the single filing status adjustment for tax calculation
    }
}
