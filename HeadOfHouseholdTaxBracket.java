
public class HeadOfHouseholdTaxBracket extends TaxBracket{
    public HeadOfHouseholdTaxBracket(double lowerRange, double upperRange, double taxRate) {
        super(lowerRange, upperRange, taxRate);
    }
    
    public double calculateTax(double taxableIncome) {
        return super.calculateTax(taxableIncome); // Use the head of household filing status tax calculation
    }
}
