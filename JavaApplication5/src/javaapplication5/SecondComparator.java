package javaapplication5;

import java.util.Comparator;

class SecondComparator implements Comparator<Alumno> {
    @Override
    public int compare(Alumno e1, Alumno e2) {
        return -(e1.name).compareTo(e2.name);
    }
}
