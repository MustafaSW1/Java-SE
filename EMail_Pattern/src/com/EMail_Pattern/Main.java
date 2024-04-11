package com.EMail_Pattern;

import java.util.regex.Pattern;
/*
Die Hauptidee dieses Codes besteht darin, ein reguläres Ausdrucksmuster (Regex)
zur Überprüfung von E-Mail-Adressen zu definieren und dieses Muster dann auf eine
bestimmte E-Mail-Adresse anzuwenden, um festzustellen, ob sie dem Muster entspricht oder nicht.
 */
public class Main {

        public static void main(String[] args) {
            // Definiere ein Regex-Pattern zur Überprüfung von E-Mail-Adressen
            String emailPattern = "^[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";

            // Kompiliere das Pattern
            Pattern pattern = Pattern.compile(emailPattern);

            // Teste eine E-Mail-Adresse
            String email = "Mustafa@email.com";
            boolean isValidEmail = pattern.matcher(email).matches();
            System.out.println("Ist die E-Mail-Adresse gültig? " + isValidEmail);
        }

}
