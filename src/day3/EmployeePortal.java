package day3;

public class EmployeePortal {

    public static void main(String[] args){
        Payroll payroll = new Payroll();

        SalariedEmployee se = new SalariedEmployee(100,"aaa", 800000);
        payroll.displayGross(se);
        payroll.displayNet(se);

        Employee [] emps = new Employee[2];
        emps[0] = new SalariedEmployee(101,"ppp", 400000); //upcasting
        emps[1] = new Manager(102,"sss", 90000, 10000);
        /*
        *calculateGross() is defined in Employee and overridden in SalariedEmployee
        * hence can be invoked using Employee reference emps[0]
         */
        payroll.displayGross(emps[0]);
        /*
        to invoked calculateNet() which is defined in SalariesEmployee
        the employee reference must be downcast to salaried Employee
         */
        SalariedEmployee ss = (SalariedEmployee) emps[0]; //down casting
        payroll.displayNet(ss);

        for (Employee e : emps) {
            payroll.displayGross();
        }
    }
}
