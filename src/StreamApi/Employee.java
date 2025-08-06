package abstraction.src.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    private String name;
    private String role;
    private int salary;


    public Employee(String name, String role,int salary) {
        this.name = name;
        this.role = role;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setRole(String role) {
        this.role = role;
    }




}
