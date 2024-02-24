public class Bank {
    private double amount;

    // Parameterized constructor
    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        // Check if the withdrawal amount is less than or equal to the current balance
        String message = (withdrawalAmount <= this.amount) ? "Withdraw successful" : "Insufficient funds for withdrawal";
        
        // Update the amount if withdrawal is possible
        this.amount = (withdrawalAmount <= this.amount) ? this.amount - withdrawalAmount : this.amount;
        
        // Print the message
        System.out.println(message);
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        // Update the amount after deposit
        this.amount += depositAmount;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Total balance: " + this.amount);
    }

    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank myAccount = new Bank(10000.0);

        // Withdraw some amount
        double withdrawalAmount = 7000.0;
        myAccount.withdraw(withdrawalAmount);

        // Deposit some amount
        double depositAmount = 5000.0;
        myAccount.deposit(depositAmount);

        // Display total balance
        myAccount.displayBalance();
    }
}
