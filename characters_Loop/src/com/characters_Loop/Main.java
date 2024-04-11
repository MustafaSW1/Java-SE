package com.characters_Loop;

import java.io.*;

/*
 * Der Code funktioniert wie ein einfacher Passwortgenerator,
 * der Passwörter generiert, indem er die eingegebenen Buchstaben verwendet.
 * Jedes Passwort besteht aus 4 Buchstaben. Er erstellt eine Datei an einem bestimmten Pfad,
 * die die generierten Passwörter enthält. Am Ende zählt er die Anzahl der generierten Passwörter.
 */

public class Main {
    public static void main(String[] args) {

        // Buchstaben, die verwendet werden, um die Passwörter zu generieren
        // PL = Password List
        final String PL1 = "abcd";
        final String PL2 = "efg";
        final String PL3 = "hij";
        final String PL4 = "klm";

        // Alle Buchstaben zu einem einzigen String zusammenfügen
        final String PL = PL1 + PL2 + PL3 + PL4;

        try {
            // Datei definieren, erstellen und Pfad eingeben.
            File passwordFile = new File("/Users/Ibraheem/Desktop/myPassWords.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(passwordFile));

            // Wenn passwordFile nicht existiert, wird es erstellt.
            if (!passwordFile.isFile())
                passwordFile.createNewFile();

            // Passwörter generieren und in die Datei schreiben

            // Einzelne Buchstaben Passwörter generieren und in die Datei schreiben
            for (int k = 0; k < PL.length(); k++) {
                String pw = PL.charAt(k) + "\n";
                System.out.print(pw);
                writer.write(pw);


                // Passwörter mit 2 Buchstaben generieren und in die Datei schreiben
                for (int j = 0; j < PL.length(); j++) {
                    String pw2 = PL.charAt(k) + "" + PL.charAt(j) + "\n";
                    System.out.print(pw2);
                    writer.write(pw2);


                    // Passwörter mit 3 Buchstaben generieren und in die Datei schreiben
                    for (int i = 0; i < PL.length(); i++) {
                        String pw3 = PL.charAt(k) + "" + PL.charAt(j) + "" + PL.charAt(i) + "\n";
                        System.out.print(pw3);
                        writer.write(pw3);


                        // Passwörter mit 4 Buchstaben generieren und in die Datei schreiben
                        for (int f = 0; f < PL.length(); f++) {
                            String pw4 = PL.charAt(k) + "" + PL.charAt(j) + "" + PL.charAt(i) + PL.charAt(f) + "\n";
                            System.out.println(pw4);
                            writer.write(pw4);
                        }
                    }
                }
            }

            // Schließen des Writers
            writer.close();

            // Anzahl der generierten Passwörter berechnen
            System.out.println("Number of Passwords = " + Math.pow(PL.length(), 4));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
