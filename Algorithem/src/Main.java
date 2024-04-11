
/*
Die Aufgabe des Codes besteht darin, die eingegebene Zahlen umzukehren
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nummer ;
        int ursprünglicheNummer ;
        int ergebnis = 0;
        int rest ;


        System.out.print("Geben Sie eine Zahl ein : ");
        //Zahlenumkehrvorgang
        nummer = in.nextInt();
        ursprünglicheNummer = nummer;
        while (nummer != 0){
            rest = nummer%10;
            ergebnis = ergebnis*10+rest;
            nummer /=10;
        }
        //Umgekehrtes Ergebnis
        System.out.println("die umgekehrte nummer von "+ ursprünglicheNummer+" ist :"+ergebnis);

        //Wechsel von int zu String
        String changeFN1 = String.valueOf(ursprünglicheNummer);
        String changeFN2 = String.valueOf(ergebnis);

        //die ursprüngliche Nummer mit der umgekehrten Nummer zusammen ausdrucken
        String palindrome = changeFN1 + changeFN2;
        System.out.println("die palindrome ist :"+palindrome);


    }
}
