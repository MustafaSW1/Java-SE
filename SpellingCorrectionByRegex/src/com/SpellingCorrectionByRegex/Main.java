package com.SpellingCorrectionByRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*
    Den Code korrigiert meinen Name Von Mostafa zu Mustafa (o --> u)
     */
    public static void main(String[] args) {
        // Text, der korrigiert werden soll
        String s = "Manche Leute schreiben meinen Namen als 'mustafa', und manche als 'mostafa', aber mein Name ist so geschrieben: 'mustafa'. Deshalb korrigiert das Programm Rechtschreibfehler von 'mostafa' zu 'mustafa'.";

        // Das Muster zum Finden von Rechtschreibfehlern
        String check = "mostafa.*?";
        // Das Muster wird kompiliert
        Pattern patt = Pattern.compile(check);
        // Der Matcher wird initialisiert, um das Muster im Text zu finden
        Matcher mat = patt.matcher(s);

        // Vor der Korrektur ausgeben
        System.out.println("Vor der Korrektur :: " + s);
        // Rechtschreibfehler im Text durch "mustafa" ersetzen
        s = mat.replaceAll("mustafa");
        // Nach der Korrektur ausgeben
        System.out.println("Nach der Korrektur :: " + s);
    }
}
