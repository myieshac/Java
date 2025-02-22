//This program shows the concepts of constructors.
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            return; 
        }
        
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            return; 
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created successfully!");
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class AccountData {
    public static void main(String[] args) {
        Account account1 = new Account("123456", 1000.0); 
        account1.displayAccountDetails();

        Account account2 = new Account("", 500.0); 
        Account account3 = new Account("789012", -200.0); 
    }
}
