package day7;

import java.util.Set;

public class Employee {
    private int empid;
    private String name;
    private double salary;
    private Set<String> skillset;
    private String department;

    public Employee(int empid, String name, double salary, Set<String> skillset, String department) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.skillset = skillset;
        this.department = department;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public Set<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
