// Concrete implementation of Bank interface
public class BankAccount implements Bank {
    
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    @Override
    public double checkBalance() {
        return balance;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
    
    @Override
    public boolean transfer(Bank destination, double amount) {
        if (withdraw(amount)) {
            destination.deposit(amount);
            System.out.println(amount + " transferred successfully.");
            return true;
        } else {
            System.out.println("Transfer failed due to insufficient balance.");
            return false;
        }
    }
    
    // Example usage in a main method
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);
        
        System.out.println("Initial balances:");
        System.out.println("Account 1: " + account1.checkBalance());
        System.out.println("Account 2: " + account2.checkBalance());
        
        account1.transfer(account2, 300);
        
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1: " + account1.checkBalance());
        System.out.println("Account 2: " + account2.checkBalance());
    }
}
