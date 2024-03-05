package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        String stop = "";
        while (!Objects.equals(stop, ":q")){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola ");
        String parola = scanner.nextLine();
        div(parola);
            System.out.println("se vuoi fermare il programma inserisci ':q' altrimenti premi inviao");
            stop = scanner.nextLine();
        }
    }

    public static void div (String parola){
        int length = parola.length();

        for (int i = 0; i< length; i++){

            System.out.println(parola.charAt(i) + ",");


        }
    }
}
