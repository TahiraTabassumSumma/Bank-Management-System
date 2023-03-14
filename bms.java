import java.util.Scanner;

public class BankManagementSystem {
    
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;
    
    public static void main(String[] args) {
        System.out.println("Welcome to Bank Management System!");
        int option = 0;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double amount = scanner.nextDouble();
                    balance += amount;
                    System.out.println("$" + amount + " has been deposited into your account.");
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: $");
                    amount = scanner.nextDouble();
                    if (balance < amount) {
                        System.out.println("Insufficient balance. Please try again.");
                    } else {
                        balance -= amount;
                        System.out.println("$" + amount + " has been withdrawn from your account.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Management System!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }
}
