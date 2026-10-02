import java.util.List;

public class PayrollReport {

    private List<Employee> employees;

    public PayrollReport(List<Employee> employees) {
        this.employees = employees;
    }

    public void generateReport() {

        System.out.println("======== PAYROLL REPORT ========");

        for (Employee employee : employees) {

            employee.displayEmployeeDetails();

            System.out.println("Gross Salary : " + employee.calculateGrossSalary());
            System.out.println("Deduction    : " + employee.calculateDeduction());
            System.out.println("Net Salary   : " + employee.calculateNetSalary());

            System.out.println("-------------------------------");
        }

        System.out.println("================================");
    }
}
