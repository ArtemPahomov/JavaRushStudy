package com.test.lambda;

import java.util.ArrayList;

public class Employee {
    String name;
    String department;
    int salary;

    Employee(String name,String department,int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    public void printEmployee(Employee emp){
        System.out.println("Name: "+ emp.name + ", department: " +emp.department + ", salary: "+emp.salary);
    }

    public void filtraciyaRabotnikov(ArrayList<Employee>list,Predicate<Employee>pred){
        for (Employee employee : list) {
            if(pred.test(employee)){
                printEmployee(employee);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Artem","it",2000);
        Employee emp2 = new Employee("Evan","economy",1000);
        Employee emp3 = new Employee("Inna","management",1200);
        Employee emp4 = new Employee("Stepan","security",700);
        Employee emp5 = new Employee("it","it",1234);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        TestEmployee employee = new TestEmployee();

        employee.filtraciyaRabotnikov(list,pred->pred.department.equals("it"));
        System.out.println("==============================================");
        employee.filtraciyaRabotnikov(list,pred->pred.name.startsWith("E")&&pred.salary!=450);
        System.out.println("==============================================");
        employee.filtraciyaRabotnikov(list,pred->pred.department.equals(pred.name));

    }
}
