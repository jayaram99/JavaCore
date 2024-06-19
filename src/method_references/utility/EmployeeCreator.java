package method_references.utility;

import method_references.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCreator {
    public static List<Employee> createEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Abhishek", 60));
        employeeList.add(new Employee(177, "Sneh", 55));
        employeeList.add(new Employee(129, "John", 20));
        employeeList.add(new Employee(101, "Abhishek", 50));
        employeeList.add(new Employee(153, "Robert", 44));
        employeeList.add(new Employee(102, "Elisa", 90));
        return employeeList;
    }
}