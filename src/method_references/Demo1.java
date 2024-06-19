package method_references;

import method_references.entity.Employee;
import method_references.utility.CustomComparator;
import method_references.utility.EmployeeCreator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Without Method Referencing
public class Demo1 {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeCreator.createEmployees();
        CustomComparator customComparator = new CustomComparator();

        System.out.println("Sort by name:");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return customComparator.compareByName(o1, o2);
            }
        });
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("Sort by marks:");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return customComparator.compareByMarks(o1, o2);
            }
        });
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}