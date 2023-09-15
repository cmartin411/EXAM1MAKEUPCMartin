import java.util.Scanner;

public class TaxCalculator {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Initialize the tax brackets
        SingleTaxBracket singleFilingBracket = new SingleTaxBracket(0, 10000, 0.10);
        MarriedJointlyTaxBracket marriedJointlyFilingBracket = new MarriedJointlyTaxBracket (0, 100000, 0.15);
        MarriedSeparatelyTaxBracket marriedSeparatelyFilingBracket = new MarriedSeparatelyTaxBracket(0, 176500, 0.15);

        
        // Prompt the user to enter their filing status
        System.out.print("Enter your filing status: ");
        String filingStatus = in.next();
        
        // Calculate the tax owed based on the entered filing status and income
        if (filingStatus.equals("Single Tax Filer")) {
            System.out.println("Your tax owed is: " + singleFilingBracket.calculateTax(in.nextDouble()));
        } else if (filingStatus.equals("Married, Filing Jointly")) {
            System.out.println("Your tax owed is: " + marriedJointlyFilingBracket.calculateTax(in.nextDouble()));
        } else if (filingStatus.equals("Married, Filing Separately")) {
            System.out.println("Your tax owed is: " + marriedSeparatelyFilingBracket.calculateTax(in.nextDouble()));
        }
        in.close();
    }
}
