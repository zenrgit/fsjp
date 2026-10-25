import java.util.Scanner;

public class BankAccount{
    String ownerName;
    int accountNumber;
    double balance;
    String accountType;

    // Default Constructor
    BankAccount() {
        this.ownerName = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
        this.accountType = "Unknown";
    }

    // Parameterized Constructor
    BankAccount(String ownerName, int accountNumber, double balance, String accountType) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    void displayAccountDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Default Constuctor
        BankAccount account1 = new BankAccount();
        System.out.println("Default Constructor:");
        account1.displayAccountDetails();

        //Parameterized Constructor
        BankAccount account2 = new BankAccount("Vaibhav Sable", 123456, 1000.0, "Savings");
        System.out.println("\nParameterized Constructor:");
        account2.displayAccountDetails();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account2.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account2.withdraw(withdrawAmount);
                    break;
                case 3:
                    account2.displayAccountDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
