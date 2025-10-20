import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double INTEREST_RATE = 0.03;
        double balance;
        int year = 1;
        int choice;

        System.out.println("Welcome to the Bank Balance Calculator!");
        System.out.print("Enter your starting balance: ");
        balance = input.nextDouble();

        do {
            System.out.print("\nDo you want to see the balance for next year?");
            System.out.print("\nEnter 1 for yes or any other number for no: ");
            choice = input.nextInt();

            if (choice == 1) {
                balance = balance + (balance * INTEREST_RATE);
                System.out.printf("After year %d, your balance is $%.2f%n", year, balance);
                year++;
            }

        } while (choice == 1);

        System.out.println("\nThank you for using the program.");
        input.close();
    }
}
