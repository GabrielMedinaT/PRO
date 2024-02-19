package javaapplication5;

import java.util.Comparator;

class ThirdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.expediente.compareTo(e2.expediente);
    }
}
