import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Payroll Processing System ===");

        try {
            System.out.print("Enter Employee Number (max 9999): ");
            int employeeNumber = scanner.nextInt();

            System.out.print("Enter Pay Rate (max $60.00/hour): ");
            double payRate = scanner.nextDouble();

            System.out.print("Enter Hours Worked This Week: ");
            double hoursWorked = scanner.nextDouble();

            Employee employee = new Employee(employeeNumber, payRate);

            double regularPay = employee.calculateRegularPay(hoursWorked);
            double overtimePay = employee.calculateOvertimePay(hoursWorked);
            double totalPay = regularPay + overtimePay;

            System.out.println("\n--- Payroll Summary ---");
            System.out.println("Employee Number: " + employee.getEmployeeNumber());
            System.out.printf("Pay Rate: $%.2f per hour%n", employee.getPayRate());
            System.out.printf("Regular Pay: $%.2f%n", regularPay);
            System.out.printf("Overtime Pay: $%.2f%n", overtimePay);
            System.out.printf("Total Pay: $%.2f%n", totalPay);

        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nError: Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }

        System.out.println("\nThank you for using the Payroll System!");
    }
}
