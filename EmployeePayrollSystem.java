package Class_Object;


import java.util.ArrayList;

public class EmployeePayrollSystem {

    private ArrayList<Employee> employees;

    public EmployeePayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void calculatePayroll() {
        for (Employee employee : this.employees) {
            double salary = employee.getSalary();
            double taxDeduction = calculateTaxDeduction(employee);
            double netPay = salary - taxDeduction;

            // Generate pay stub
            PayStub payStub = new PayStub(employee, salary, taxDeduction, netPay);
            employee.setPayStub(payStub);
        }
    }

    private double calculateTaxDeduction(Employee employee) {

        return employee.getSalary() * 0.1;
    }

    public void generatePayStubs() {
        for (Employee employee : this.employees) {
            PayStub payStub = employee.getPayStub();
            System.out.println(payStub);
        }
    }

    public static void main(String[] args) {
        EmployeePayrollSystem system = new EmployeePayrollSystem();

        // Add some employees
        system.addEmployee(new Employee("John Doe", 50000));
        system.addEmployee(new Employee("Jane Doe", 40000));
        system.addEmployee(new Employee("John Doe", 80000));
        system.addEmployee(new Employee("Jane Doe", 60000));

        // Calculate payroll
        system.calculatePayroll();

        // Generate pay stubs
        system.generatePayStubs();
    }
}

class Employee {
    private String name;
    private double salary;
    private PayStub payStub;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public PayStub getPayStub() {
        return payStub;
    }

    public void setPayStub(PayStub payStub) {
        this.payStub = payStub;
    }
}

class PayStub {
    private Employee employee;
    private double salary;
    private double taxDeduction;
    private double netPay;

    public PayStub(Employee employee, double salary, double taxDeduction, double netPay) {
        this.employee = employee;
        this.salary = salary;
        this.taxDeduction = taxDeduction;
        this.netPay = netPay;
    }

    @Override
    public String toString() {
        return "Pay Stub for " + employee.getName() + "\n" +
                "Salary: $" + salary + "\n" +
                "Tax Deduction: $" + taxDeduction + "\n" +
                "Net Pay: $" + netPay;
    }
}