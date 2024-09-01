package qtwo;
import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = generateEmployeeId();
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public static int generateEmployeeId() {
        // Generate a unique employee ID implementation
        return (int) (Math.random() * 1000);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

class PermanentEmployee extends Employee {
    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" + super.toString() + '}';
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + super.toString() + '}';
    }
}

class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.02;
    }

    @Override
    public String toString() {
        return "Intern{" + super.toString() + '}';
    }
}

interface Payable {
    double calculatePayment();
}

class PayrollSystem implements Payable {
    private List<Employee> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public double calculatePayment() {
        double totalPayment = 0;
        for (Employee employee : employees) //Iterate through each Employee in the 'employees' collection
        {
            totalPayment += employee.getSalary() + employee.calculateBonus(); //incrementing the totalPayment by salary plus bonus
        }
        return totalPayment;
    }
}

public class Qtwo {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("John", 50000);
        ContractEmployee contractEmployee = new ContractEmployee("Jane", 30000);
        Intern intern = new Intern("Doe", 20000);

        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.addEmployee(permanentEmployee);
        payrollSystem.addEmployee(contractEmployee);
        payrollSystem.addEmployee(intern);

        System.out.println("Total Payment: $" + payrollSystem.calculatePayment());

        payrollSystem.removeEmployee(contractEmployee);

        System.out.println("Updated Total Payment: $" + payrollSystem.calculatePayment());
    }
}