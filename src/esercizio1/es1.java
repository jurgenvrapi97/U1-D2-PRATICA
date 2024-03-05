package esercizio1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la parola per sapere se è pari o dispari");
        String parola = scanner.nextLine();
        PariDidpari(parola);
        System.out.println("inserisci l'anno per sapere se è bisestile");
        int anno = Integer.parseInt(scanner.nextLine());
        annoBisestile(anno);
    }

    public  static void PariDidpari (String word){
        int length = word.length();
        if (length % 2 == 0){
            System.out.println(word + " è pari");
        } else {
            System.out.println(word + " è dispari");
        }

    }

    public static void annoBisestile (int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("è bisestile");
                } else {
                    System.out.println("non è bisestile");
                }
            } else {
                System.out.println("è bisestile");
            }
        } else {
            System.out.println("non è bisestile");
        }
    }
}
