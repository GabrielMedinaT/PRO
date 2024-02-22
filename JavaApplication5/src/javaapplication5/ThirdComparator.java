package javaapplication5;

import java.util.Comparator;

class ThirdComparator implements Comparator<Alumno> {
    @Override
    public int compare(Alumno e1, Alumno e2) {
        return e1.expediente.compareTo(e2.expediente);
    }
}
