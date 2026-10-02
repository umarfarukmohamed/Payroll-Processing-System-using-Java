import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("EMP101",
                "Arun",
                3000,
                500,
                200
        );

        permanentEmployee.displayEmployeeDetails();

        System.out.println("Gross Salary : " +permanentEmployee.calculateGrossSalary());
        System.out.println("Deduction    : " +permanentEmployee.calculateDeduction());
        System.out.println("Net Salary   : " +permanentEmployee.calculateNetSalary());

        ContractEmployee employee1 = new ContractEmployee("EMP102",
                "Kumar",
                3000,
                400
        );

        employee1.displayEmployeeDetails();

        System.out.println("Gross Salary : " + employee1.calculateGrossSalary());
        System.out.println("Deduction    : " + employee1.calculateDeduction());
        System.out.println("Net Salary   : " + employee1.calculateNetSalary());


        Manager manager = new Manager("EMP103",
                "Ravi",
                5000,
                800,
                300,
                1000
        );

        manager.displayEmployeeDetails();

        System.out.println("Gross Salary : " + manager.calculateGrossSalary());
        System.out.println("Deduction    : " + manager.calculateDeduction());
        System.out.println("Net Salary   : " + manager.calculateNetSalary());

        List<Employee> employees = new ArrayList<>();

        employees.add(permanentEmployee);
        employees.add(employee1);
        employees.add(manager);

        PayrollReport report = new PayrollReport(employees);
        report.generateReport();


        //PAYROLL SERVICE
        PayrollService payrollService = new PayrollService(manager);
        payrollService.processPayroll();
        payrollService.generatePaySlip();

        //POLYMORPHISM
        Employee employee;

        employee = new PermanentEmployee("EMP104",
                "Suresh",
                3000,
                500,
                200
        );

        System.out.println("Permanent Employee Gross Salary : "
        + employee.calculateGrossSalary());

        employee = new ContractEmployee("EMP105",
                "Vijay",
                3000,
                400
        );

        System.out.println("Contract Employee Gross Salary  : "
        + employee.calculateGrossSalary());

        employee = new Manager("EMP106",
                "Raj",
                5000,
                800,
                300,
                1000
        );

        System.out.println("Manager Gross Salary            : "
        + employee.calculateGrossSalary());

    }
}


