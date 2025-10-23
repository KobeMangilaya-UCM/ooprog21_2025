import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03;
        char choice;

        System.out.print("Enter your starting balance: ");
        balance = input.nextDouble();

        int year = 1;

        do {
            balance += balance * INTEREST_RATE;
            System.out.printf("After year %d, your balance is: %.2f%n", year, balance);
            year++;

            System.out.print("Would you like to continue for another year? (Y/N): ");
            choice = input.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.printf("Your final balance is: %.2f%n", balance);
        System.out.println("Thank you for using the program!");

        input.close();
    }
}
