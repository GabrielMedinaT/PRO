package javaapplication5;

import java.util.Comparator;

class FirstComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if ((e1.name).compareTo(e2.name)!=0 ){
                return (e1.name).compareTo(e2.name);     
    }
        return (e1.expediente).compareTo(e2.expediente);
    }
}
