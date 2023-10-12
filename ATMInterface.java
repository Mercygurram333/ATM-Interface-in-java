import java.util.*;

public class ATMInterface {
    private static double balance = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            
            System.out.println("ATM Interface");
            System.out.println("1. check  balance");
            System.out.println("2. Deposite");
            System.out.println("3.Withdraw");
            System.out.println("exit");
            System.out.println("enter your choice");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                checkBalance();
                break;
                case 2:
                deposit(scanner);
                break;
                case 3:
                Withdraw(scanner);
                break;
                case 4:
                System.out.println("Thank you for using the ATM.Goodbye!");
                 System.exit(0);
                default:
                System.out.println("Invalid choice.Please try again.");
            }


            
        }



    }
    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);

    }
    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit:$");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" +balance);

        } else {
            System.out.println("Invalid amount. please enter amount. ");
        }
    }

    private static void Withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.Your new balance is:" +balance);

        } else if(amount <= 0) {
            System.out.println("Invalid amount.Please enter a positive amount.");
        } else {
            System.out.println("Insufficient funds. Your balance is: $" +balance);
        }

    }

        

    


}