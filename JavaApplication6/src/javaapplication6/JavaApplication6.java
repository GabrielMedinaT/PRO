
package javaapplication6;

public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear disco

        Disco d1 = new Disco("Recopilacion años 90");
        Disco d2 = new Disco("Recopilacion años 80");


        Cancion c2 = new Cancion("Eye of the Tiger");
        Cancion c3 = new Cancion("I Want to Break Free");
        Cancion c4 = new Cancion("Another One Bites the Dust");
        Cancion c5 = new Cancion("I Want it that Way");
        Cancion c6 = new Cancion("Everybody");
        Cancion c7 = new Cancion("ups i did it again");
        Cancion c8 = new Cancion("I will always love you");
        Cancion c9 = new Cancion("Always");

       /* Cantante cantante1 = new Cantante("Europe");
        Cantante cantante2 = new Cantante("Survivor");
        Cantante cantante3 = new Cantante("Queen");
        Cantante cantante4 = new Cantante("BackstreetBoys");
        Cantante cantante5 = new Cantante("Britney Spears");
        Cantante cantante6 = new Cantante("Whitney Houston");
        Cantante cantante7 = new Cantante ("Europe" , d1, c2);
        Cantante cantante8 = new Cantante ("Europe" , d1, c3);*/
       
        Cantante c1 = new Cantante("Queen");
        c1.agregarCancion(d1, c8);
        c1.agregarCancion(d1, c2);

// After creating each Disco, reset k



c1.ver();

    }

}
