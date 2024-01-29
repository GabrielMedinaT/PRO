/**
 * Demo de las clases Club y Miembro
 * author K�lling y Barnes
 */
public class ClubDemo {
    private Club club;

    public ClubDemo() {
        club = new Club();
    }

    public void demo() {
        club.aniadir(new Miembro("David", 2, 2004));
        club.aniadir(new Miembro("Michael", 1, 2004));
        System.out.println("El club tiene " + club.numeroMiembros() + " miembros.");
    }
}
