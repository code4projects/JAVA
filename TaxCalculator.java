// TaxCalculator.java
public class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        double taxAmount;
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        return taxAmount;
    }
}

// CalculatorSimulator.java
public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        
        try {
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
        
        try {
            // Test Case 2
            double tax2 = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax2);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
        
        try {
            // Test Case 3
            double tax3 = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax3);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
        
        try {
            // Test Case 4
            double tax4 = taxCalculator.calculateTax(null, true, 30000);
            System.out.println("Tax amount is " + tax4);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}

// Custom Exceptions
public class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

public class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

public class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}