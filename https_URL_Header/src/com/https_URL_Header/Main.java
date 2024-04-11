package com.https_URL_Header;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.Certificate;

/*
Die Hauptidee dieses Codes besteht darin,
 eine HTTPS-Verbindung zu einer bestimmten URL herzustellen,verschiedene Informationen
 über die Verbindung abzurufen und den Inhalt der URL zu drucken.
 */
public class Main {

    public static void main(String[] args) {
        Main hc = new Main();
        hc.check();
    }

    // Methode zur Überprüfung der HTTPS-Verbindung und zum Abrufen des Inhalts
    private void check() {
        // Die URL, zu der eine Verbindung hergestellt werden soll
        String https = "https://www.facebook.com";
        URL url;

        try {
            // Erzeugt eine URL-Instanz für die angegebene HTTPS-URL
            url = new URL(https);
            // Öffnet eine HTTPS-Verbindung zur URL
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            // Ruft Zertifikatinformationen und Cipher-Suite-Details ab
            https_cert(con);
            // Druckt den Inhalt der URL
            print_content(con);
        } catch (IOException e) {
            // Behandelt mögliche Ausnahmen, z. B. Verbindungsfehler
            e.printStackTrace();
        }
    }

    //Methode zum Abrufen von Zertifikatinformationen und Cipher-Suite-Details
    private void https_cert(HttpsURLConnection con) {
        // Überprüft, ob die Verbindung vorhanden ist
        if (con != null) {
            try {
                // Druckt den Antwortcode der Verbindung und die Cipher-Suite-Details
                System.out.println("getResponseCode :"+con.getResponseCode());
                System.out.println("Cipher :"+con.getCipherSuite());
                System.out.print("");

                // Ruft die Serverzertifikate ab und druckt ihre Details
                java.security.cert.Certificate []cert = con.getServerCertificates();
                for (Certificate certificate : cert) {
                    System.out.println("cert Type :"+certificate.getType());
                    System.out.println("cert hash code :"+certificate.hashCode());
                    System.out.println("public key :"+certificate.getPublicKey().getAlgorithm());
                    System.out.println("key format :"+certificate.getPublicKey().getFormat());
                    System.out.print("");
                }
            } catch (IOException e) {
                // Behandelt mögliche Ausnahmen bei der Zertifikatsabfrage
                e.printStackTrace();
            }
        }
    }

    // Methode zum Drucken des Inhalts der URL
    private void print_content(HttpsURLConnection con) {
        // Überprüft, ob die Verbindung vorhanden ist
        if (con != null) {
            // Druckt die Überschrift für den URL-Inhalt
            System.out.println("-------------URL content----------------");
            try {
                // Liest den Inhalt der URL und druckt ihn Zeile für Zeile
                BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String in;
                while ((in = bf.readLine()) != null) {
                    System.out.println(in);
                }
                // Schließt den BufferedReader
                bf.close();
            } catch (IOException e) {
                // Behandelt mögliche Ausnahmen beim Lesen des URL-Inhalts
                e.printStackTrace();
            }
        }
    }
}
