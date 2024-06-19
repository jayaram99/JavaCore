package method_references.utility;

import method_references.entity.Employee;

public class CustomComparator {
    public int compareByName(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByMarks(Employee a, Employee b) {
        return a.getMarks() - b.getMarks();
    }
}