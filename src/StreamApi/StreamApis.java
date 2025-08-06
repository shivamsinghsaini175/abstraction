package abstraction.src.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApis {
    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee("Shivam", "Developer",1010101),
                new Employee("Udhav", "Designer",150),
                new Employee("Saloni", "Developer",100)
        );

   // List <String>Employee = Arrays.asList(abstraction.src.StreamApi.Employee);

         List<String> developers=employees.stream()
                .filter(e->e.getRole().equals("Developer"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(developers);

        List<Integer> num =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,5,7,8,4,2);

        List<Integer> unique=num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

       employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                        .forEach(e-> System.out.println(e));

       // System.out.println(sorted);
    }
}