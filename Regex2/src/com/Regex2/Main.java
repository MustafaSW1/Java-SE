package com.Regex2;

import java.util.regex.Pattern;

/*
Der Code testet verschiedene reguläre Ausdrücke, um zu überprüfen,
ob Zeichenfolgen mit einem bestimmten Muster übereinstimmen.
 */
public class Main {

    public static void main(String[] args) {
        boolean b1 = Pattern.matches(".m","bm");
        boolean b2 = Pattern.matches(".m","abc");
        boolean b3 = Pattern.matches(".m","bmw");
        boolean b4 = Pattern.matches(".m","bmwm");
        boolean b5 = Pattern.matches("..m","abm");

        // Ausgabe der Ergebnisse
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        
    }
}
