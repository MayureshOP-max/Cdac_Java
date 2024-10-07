package day5;

import day5_collection.Employee;
import day5_collection.NameComparator;
import day5_collection.SalaryComparator;

import java.util.*;

public class EmployeeCollection {
    public List<Employee> initializeEmployeData(){
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1= new TreeSet<>();
        skills1.add("java");
        skills1.add("C");
        emplist.add(new Employee(567, "aaa", 47500, skills1));
        Set<String> skills2= new TreeSet<>();
        skills2.add("python");
        skills2.add("c#");
        emplist.add(new Employee(100, "bbb", 17500, skills2));
        Set<String> skills3= new TreeSet<>();
        skills3.add("selenium");
        skills3.add("C++");
        emplist.add(new Employee(237, "ccc", 27500, skills3));
        Set<String> skills4= new TreeSet<>();
        skills4.add("Django");
        skills4.add("R");
        emplist.add(new Employee(804, "ddd", 37500, skills4));

        return emplist;
    }
    public void printList(List<Employee> emplist){
        for(Employee e: emplist){
            System.out.println(e);
        }
    }

    public Employee searchEmployee(List<Employee> emplist, int empid){
        for(Employee e: emplist){
            if(e.getEmpid() == empid){
                return e;
            }
        }
        return null;
    }
    public List<Employee> filterEmployees(List<Employee> emplist,String criteria)
    {
        List<Employee> filtered = new ArrayList<>();
        for (Employee e: emplist)
        {
            if(e.getSkillset().contains(criteria))
                filtered.add(e);
        }
        return filtered;
    }
    public Map<Integer,Double > salaryMap(List<Employee> emplist)
    {
        Map<Integer,Double> salmap = new TreeMap<>();
        for(Employee e : emplist)
    {
        salmap.put(e.getEmpid(),e.getSalary());
    }
        return salmap;
    }


    public static void main(String[] args) {
        EmployeeCollection e = new EmployeeCollection();
        List<Employee> emplist = e.initializeEmployeData();
        e.printList(emplist);

        Employee found = e.searchEmployee(emplist, 804);
        System.out.println("Employee found=" + found);

        System.out.println("========Employee skilled at Java=============");
        List<Employee> byskill = e.filterEmployees(emplist, "Java");
        e.printList(byskill);

        System.out.println("========Employee Salary Mapping =============");
        Map<Integer, Double> sal = e.salaryMap(emplist);
        for(Map.Entry<Integer, Double> entry: sal.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }


        System.out.println("=============sort by employee id==============");
        Collections.sort(emplist);
        e.printList(emplist);
        System.out.println("-----------------sort by employee id----------------");
        int index = Collections.binarySearch(emplist,new Employee(567,null,0,null));
        System.out.println("Found At index" + index);

        System.out.println("=============sort by employee Name==============");
        emplist.sort(new NameComparator());
        e.printList(emplist);
        System.out.println("=============sort by employee Name==============");
        index = Collections.binarySearch(emplist,new Employee(0,"bbb",0,null),
                new NameComparator());
        System.out.println("Found At index" + index);

        System.out.println("=============sort by employee Salary==============");
        emplist.sort(new SalaryComparator());
        e.printList(emplist);

        System.out.println("++++++++++Minimum Salary++++++++++++++++++++++\n");
        System.out.println(Collections.min(emplist, new SalaryComparator()));

        System.out.println("++++++++++++++++++++Maximum Salary++++++++++++++\n");
        System.out.println(Collections.max(emplist, new SalaryComparator()));

        System.out.println("+++++++++++++==========Reverse order==========+++++++++++++++\n");
        Collections.reverse(emplist);
        e.printList(emplist);



    }
}


