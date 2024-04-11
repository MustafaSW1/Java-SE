package com.IO_File_Sequence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
Die Hauptidee dieses Codes ist es, mehrere Dateien gleichzeitig zu öffnen
und ihre Inhalte sequenziell auszugeben, indem ein zusammengesetzter Eingabestrom verwendet wird.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Öffnen der Eingabeströme für die einzelnen Dateien
        FileInputStream in1 = new FileInputStream("salary1.txt");
        FileInputStream in2 = new FileInputStream("salary2.txt");
        FileInputStream in3 = new FileInputStream("salary3.txt");
        FileInputStream in4 = new FileInputStream("salary4.txt");

        // Erstellen eines Vektors, um die Eingabeströme zu speichern
        Vector<FileInputStream> vec = new  Vector<FileInputStream>();
        vec.add(in1);
        vec.add(in2);
        vec.add(in3);
        vec.add(in4);
        // Erstellen einer Enumeration aus den Elementen des Vektors
        Enumeration en = vec.elements();
        // Erstellen eines zusammengesetzten Eingabestroms aus den einzelnen Eingabeströmen
        SequenceInputStream sq = new SequenceInputStream(en);
        int i = 0;
        // Lesen und Ausgeben der Zeichen aus dem zusammengesetzten Eingabestrom
        while ((i=sq.read()) != -1){
             System.out.print((char)i);
        }

        sq.close();
        in1.close();
        in2.close();
        in3.close();
        in4.close();

    }
}




