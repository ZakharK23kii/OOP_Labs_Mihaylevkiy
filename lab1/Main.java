package lab1;


public class Main {
    public static void main(String[] args) {
        Date d = new Date(14, 8, 2008);
        d.printInfo();
        System.out.println("_______________________________");

        Director zakharInfo = new Director("Zakhar", "Mihaylevski", d);
        zakharInfo.printInfo();
        System.out.println("_______________________________");


        Date screeningDate = new Date(10, 10, 2025);
        Screening newScreening = new Screening("New Screening", 1000000, screeningDate);
        newScreening.printInfo();
        System.out.println("_______________________________");


        Movie titanic = new Movie("Titanic", MovieGenre.DRAMA, zakharInfo);
        titanic.printInfo();
        System.out.println("_______________________________");
    }
}
