package com.File;

/*
Dieses Programm liest den Inhalt einer Textdatei mit dem Namen "mu.txt" ein
, kopiert diesen Inhalt und schreibt ihn in eine neue Datei mit dem Namen "new.txt".
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            // FileInputStream- und FileOutputStream-Objekte initialisieren
            FileInputStream f = null;
            FileOutputStream o = null;

            // FileInputStream und FileOutputStream für die Dateien "mu.txt" und "new.txt" initialisieren
            f = new FileInputStream("mu.txt");
            o = new FileOutputStream("new.txt");

            // Eine leere String zum Speichern der gelesenen Daten initialisieren
            String s = "";

            int i;
            // Daten aus der Eingabedatei "mu.txt" lesen und in die String s schreiben
            while ((i = f.read()) != -1) {
                s = s + (char)i;
            }


           // Jedes Zeichen in der String s durchlaufen und in die Ausgabedatei "new.txt" schreiben
            for (i = 0; i < s.length(); i++) {
                int c = s.charAt(i);
                o.write(c);
            }

            // FileInputStream und FileOutputStream schließen
            f.close();
            o.close();

            // Fehler behandeln, wenn beim Lesen oder Schreiben von Dateien ein Problem auftritt
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}