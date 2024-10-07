package day7;
import Day6.Predicate;

import java.util.*;
import java.util.stream.Stream;

public class EmployeeStream {
    public List<Employee> initializeEmployeeData() {
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C");
        emplist.add(new Employee(567, "aaa", 47500, skills1, "IT"));
        Set<String> skills2 = new TreeSet<>();
        skills2.add("python");
        skills2.add("c#");
        emplist.add(new Employee(100, "bbb", 17500, skills2, "IT"));
        Set<String> skills3 = new TreeSet<>();
        skills3.add("selenium");
        skills3.add("C++");
        emplist.add(new Employee(237, "ccc", 27500, skills3, "Admin"));
        Set<String> skills4 = new TreeSet<>();
        skills4.add("Django");
        skills4.add("R");
        emplist.add(new Employee(804, "ddd", 37500, skills4, "Admin"));

        return emplist;
    }

    public static void main(String[] args) {
        EmployeeStream e = new EmployeeStream();
        List<Employee> emplist = e.initializeEmployeeData();
        Stream<Employee> stream = emplist.stream();

        Comparator<Employee> byname = Comparator.comparing(Employee::getName);
        System.out.println("-------------Sorting by name----------");
        stream.sorted(byname).forEach(System.out::println);

        stream = emplist.stream();
        Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
        System.out.println("-------------Sorting by name for dept----------");
        stream.sorted(bydept).forEach(System.out::println);

        System.out.println("---------------------------------------------------");
        stream= emplist.stream();
        Predicate<Employee> salrange = (emp) -> {
            if(emp.getSalary() >= 5000  && emp.getSalary()<70000)
                return true;
            else 
                return false;
        };
        stream.filter


    }
}