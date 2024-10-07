package day3;

public class Manager extends SalariedEmployee{
    protected float allowance;

    public Manager(int empid , String name,double basic ,int allowance){
        super(empid,name,basic);
        this.allowance = allowance;
    }
    @Override
    public double calculateGross(){
        double gross = super.calculateGross();
        return gross + gross*(this.allowance/100);
    }
    public void displayAllowance(){
        System.out.println("Allowance: "+ allowance);
    }
}
