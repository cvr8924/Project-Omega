package entities;


import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws IOException {
        System.out.println("\nHello World\n\n");
        Kor kor = new Kor();
        Lyr lyr = new Lyr();
        Ime ime = new Ime();
        kor.consolePrint();
        System.out.println("\n\n");
        lyr.consolePrint();
        System.out.println("\n\n");
        ime.consolePrint();


        Save saver = new Save();
        saver.save("/Users/crobinson/Project-Omega/src/Files/save.json",kor,lyr,ime);
    }

}
