import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Demo for Collection Classes
        // List basic methods i. add ii. set iii. remove

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for(Integer i : arrayList) {
            System.out.println(i);
        }

        arrayList.set(1,4);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Comparable and Comparator interfaces

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(5,"Jayaram"));
        employees.add(new Employee(4,"Abhi"));
        employees.add(new Employee(2,"Bunty"));

        System.out.println(employees);

        // sort based on Id
        // sort method doesn't work for objects, so implement Comparable interface in the class of that object
        // override compareTo method
        Collections.sort(employees);
        System.out.println(employees);

        // sorting any required field
        // sort method doesn't work for objects, so create new class implement Comparator<E> interface
        // Mention the class of that object needed to be sorted in place of E
        // override compare method

        Collections.sort(employees, new CustomEmployeeComparator() {});
        System.out.println(employees);

    }
}