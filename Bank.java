// Define a Bank interface
public interface Bank {
    
    // Method to check balance
    double checkBalance();
    
    // Method to deposit money
    void deposit(double amount);
    
    // Method to withdraw money
    boolean withdraw(double amount);
    
    // Method to transfer money to another account
    boolean transfer(Bank destination, double amount);
}
