package javaapplication5;

import java.util.Comparator;

class FirstComparator implements Comparator<Alumno> {
    @Override
    public int compare(Alumno e1, Alumno e2) {
        if ((e1.name).compareTo(e2.name)!=0 ){
                return (e1.name).compareTo(e2.name);
    }
        return (e2.expediente).compareTo(e1.expediente);
    }
}
