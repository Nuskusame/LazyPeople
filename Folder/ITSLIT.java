package Folder;

//IMPORTS
import java.util.Scanner;

public class ITSLIT {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double Howmanyhoesyougot = kb.nextInt();

        if (Howmanyhoesyougot > 3) {
            System.out.println("DAMN NIGGA YOU A PLAYER");

        } else {
            System.out.println("NAH YOU TWEAKING");
        }
        kb.close();
    }
}
