package method_references;

import method_references.entity.Employee;
import method_references.utility.CustomComparator;
import method_references.utility.EmployeeCreator;

import java.util.Collections;
import java.util.List;

// With Method References
public class Demo2 {
        public static void main(String[] args) {
            List<Employee> employeeList = EmployeeCreator.createEmployees();
            CustomComparator customComparator = new CustomComparator();

            System.out.println("Sort by name:");
            Collections.sort(employeeList, customComparator::compareByName);

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }

            System.out.println("Sort by marks:");
            Collections.sort(employeeList, customComparator::compareByMarks);

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }

}
