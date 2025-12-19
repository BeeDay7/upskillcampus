import java.util.Scanner;

public class BankingInformationSystem {

    static double balance = 1000.00;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("===== Welcome to Banking Information System =====");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositAmount();
                    break;
                case 3:
                    withdrawAmount();
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    static void checkBalance() {
        System.out.println("Your current balance is: ₦" + balance);
    }

    static void depositAmount() {
        System.out.print("Enter amount to deposit: ₦");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    static void withdrawAmount() {
        System.out.print("Enter amount to withdraw: ₦");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
