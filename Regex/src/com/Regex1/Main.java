package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Der Code demonstriert die Verwendung von regulären Ausdrücken in Java auf zwei verschiedene Arten.
Er zeigt, wie man mit den Pattern- und Matcher-Klassen arbeitet und wie man die Pattern.matches()-Methode
direkt verwendet, um einen regulären Ausdruck auf eine Zeichenfolge anzuwenden und festzustellen,
ob er übereinstimmt
 */
public class Main {

    public static void main(String[] args) {
        // Erstellen eines Pattern-Objekts, das ein beliebiges Zeichen gefolgt von 'm' und dann wieder einem beliebigen Zeichen erwartet
        Pattern pattern = Pattern.compile(".m.");

        // Erstellen eines Matcher-Objekts, das mit der Zeichenkette "bmw" abgeglichen wird
        Matcher matcher = pattern.matcher("bmw");

        // Überprüfen, ob das Muster im String "bmw" gefunden wurde
        boolean isMatch = matcher.matches();

        // Ausgabe des Ergebnisses des Abgleichs
        System.out.println(isMatch);

        // Erstellen eines Pattern-Objekts und eines Matchers, um zu überprüfen, ob ein beliebiges String gefolgt von 's' und wieder einem beliebigen Zeichen in der String "ksa" vorhanden ist
        boolean isMatch1 = Pattern.compile(".s.").matcher("ksa").matches();

        // Ausgabe des Ergebnisses des zweiten Abgleichs
        System.out.println(isMatch1);

        // Überprüfen, ob das Muster "mam" mit der Zeichenkette "sas" übereinstimmt
        boolean isMatch2 = Pattern.matches("mam","sas");

        // Ausgabe des Ergebnisses des dritten Abgleichs
        System.out.println(isMatch2);
    }
}
