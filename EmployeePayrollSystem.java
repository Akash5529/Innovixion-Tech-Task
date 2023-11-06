package Class_Object;


import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee information
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter employee hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Salary calculations
        double grossPay = hourlyRate * hoursWorked;

        // Tax deductions
        double taxRate = 0.2; // Assuming a 20% tax rate
        double taxDeduction = grossPay * taxRate;

        // Net pay
        double netPay = grossPay - taxDeduction;

        // Generate pay stub
        System.out.println("\nPay Stub");
        System.out.println("-----------------------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Tax Deduction: $" + taxDeduction);
        System.out.println("Net Pay: $" + netPay);
        System.out.println("-----------------------");
    }
}
