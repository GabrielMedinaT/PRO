package javaapplication31;


/**
 *
 * @author gabriel
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        a1.setNombre("Juan");
        a1.setEdad(20);
        a1.setNotas(10);

        Alumno a2 = new Alumno();
        a2.setNombre("Pedro");
        a2.setEdad(21);
        a2.setNotas(9);

        Alumno a3 = new Alumno();
        a3.setNombre("Ana");
        a3.setEdad(19);
        a3.setNotas(8);

        Alumno a4 = new Alumno();
        a4.setNombre("Maria");
        a4.setEdad(22);
        a4.setNotas(7);

        Alumno a5 = new Alumno();
        a5.setNombre("Luis");
        a5.setEdad(23);
        a5.setNotas(6);

        a1.addAlumno(a1);
        a1.addAlumno(a2);
        a1.addAlumno(a3);
        a1.addAlumno(a4);
        a1.addAlumno(a5);



    }

}
