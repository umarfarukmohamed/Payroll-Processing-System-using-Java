public class Manager extends PermanentEmployee{

    private double performanceBonus;

    public Manager(String employeeId,String employeeName, double basicSalary,
                   double houseAllowance, double transportAllowance, double performanceBonus){
        super(employeeId,employeeName,basicSalary,houseAllowance,transportAllowance);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateGrossSalary(){
        return super.calculateGrossSalary() + performanceBonus;
    }

    @Override
    public double calculateDeduction(){
        return calculateGrossSalary() * 0.12;
    }

    @Override
    public double calculateNetSalary(){
        return calculateGrossSalary() - calculateDeduction();
    }
}
