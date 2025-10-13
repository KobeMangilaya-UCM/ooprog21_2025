public class Employee {

    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_PAY_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    private int employeeNumber;
    private double payRate;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            throw new IllegalArgumentException("Employee number cannot be greater than " + MAX_EMPLOYEE_NUMBER + ".");
        }
        if (payRate > MAX_PAY_RATE) {
            throw new IllegalArgumentException("Pay rate cannot exceed $" + MAX_PAY_RATE + " per hour.");
        }

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        return 0.0;
    }
}
