package javaapplication5;

import java.util.TreeSet;

class GFG {
    public static void main(String[] args) {

        System.out.println(
                "Comprar por nombre Ascendente");

        TreeSet<Employee> gfg = new TreeSet<>(new FirstComparator());
        gfg.add(new Employee(8, "Pepe", 54));
        gfg.add(new Employee(7, "Ana de las Tejas Verdes", 23));
        gfg.add(new Employee(4, "Pipi Lastrum", 26));
        gfg.add(new Employee(9, "Pepe", 25));

        for (Employee employee : gfg) {
            System.out.println(employee);
        }
        System.out.println(
                "Comparar por nombre Descendente");

        TreeSet<Employee> gfg2 = new TreeSet<>(new SecondComparator());
        gfg2.add(new Employee(9, "Pepe", 24));
        gfg2.add(new Employee(4, "Ana de las Tejas Verdes", 23));
        gfg2.add(new Employee(2, "Pipi Lastrum", 26));
        gfg2.add(new Employee(4, "Thor", 25));

        for (Employee employee : gfg2) {
            System.out.println(employee);
        }

        System.out.println(
                "Comparar por numero de expediente");
        TreeSet<Employee> gfg3 = new TreeSet<>(new ThirdComparator());
        gfg3.add(new Employee(1, "Pepe", 4));
        gfg3.add(new Employee(2, "Ana de las Tejas Verdes", 23));
        gfg3.add(new Employee(3, "Pipi Lastrum", 26));
        gfg3.add(new Employee(4, "Thor", 25));

        for (Employee employee : gfg3) {
            System.out.println(employee);
        }
    }
}
