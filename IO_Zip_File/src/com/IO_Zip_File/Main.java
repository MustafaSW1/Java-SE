package com.IO_Zip_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/*
Die Hauptidee dieses Codes besteht darin,
den Inhalt einer txt-Datei zu lesen und sie in eine ZIP-Datei zu komprimieren
 */
public class Main {

    public static void main(String[] args)throws IOException {

        // Öffnen der Eingabedatei "mustafa.txt"
        FileInputStream fin = new FileInputStream("mustafa.txt");
        // Erstellen eines Zip-Ausgabestroms und einer Zip-Datei mit dem Namen "zip.zip"
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("/Users/Ibraheem/Desktop/zip.zip"));
        // Hinzufügen einer Zip-Datei-Eintrag für die Datei "mustafa.txt"
        out.putNextEntry(new ZipEntry("mustafa.txt"));

        byte []buffer = new byte[1024];
        int i;
        // Lesen und Schreiben der Dateiinhalte in den Zip-Ausgabestrom
        while ((i=fin.read(buffer)) > -1){
            out.write(buffer,0,i);
        }
        // Ausgabe einer Erfolgsmeldung nach dem Abschluss des Vorgangs
        System.out.println("Done");

        out.closeEntry();
        fin.close();
        out.close();
    }
}
