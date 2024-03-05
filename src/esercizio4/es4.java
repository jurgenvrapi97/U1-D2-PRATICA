package esercizio4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il valore del conto alla rovescia");
        int numero = Integer.parseInt(scanner.nextLine());
        countdown(numero);
    }

    public static void countdown (int numero){
        for (int i=numero; i != -1; i--){
            System.out.println(i);
        }
    }
}
