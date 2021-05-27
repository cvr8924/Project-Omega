package entities;


public class TestMain {

    public static void main(String[] args) {
        System.out.println("\nHello World\n\n");
        Kor kor = new Kor();
        Lyr lyr = new Lyr();
        Ime ime = new Ime();
        kor.consolePrint();
        System.out.println("\n\n");
        lyr.consolePrint();
        System.out.println("\n\n");
        ime.consolePrint();
    }

}
