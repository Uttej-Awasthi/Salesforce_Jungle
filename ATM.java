import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int balance = 1000;
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
