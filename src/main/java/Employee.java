public abstract class Employee {

    private String employeeId;
    private String employeeName;
    private double basicSalary;

    public Employee(String employeeId,String employeeName, double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Id   : "+employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Basic Salary  : "+basicSalary);
    }

    public abstract double calculateGrossSalary();

    public abstract double calculateDeduction();

    public abstract double calculateNetSalary();

}
