package com.Http_Https_URL_Connection4;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
der Code ruft Header-Felder von URL ab
 */

public class Main {
    public static void main(String[] args) throws IOException {
        // Die URL, für die die Header-Felder abgerufen werden sollen
        URL url = new URL("https://google.com");

        // Verbindung zur URL herstellen und eine HTTPS-Verbindung öffnen
        HttpsURLConnection ht = (HttpsURLConnection) url.openConnection();

        // Header-Felder der Serverantwort abrufen und in einer Map speichern
        Map<String, List<String>> header = ht.getHeaderFields();

        // Eine Menge von Schlüsseln (Header-Namen) aus der Header-Map abrufen
        Set<String> headerKey = header.keySet();

        // Durchlaufen der Menge von Header-Namen und Ausgabe von Schlüsseln und Werten
        for (String s : headerKey) {
            System.out.println("Key: " + s + " Value: " + header.get(s));
        }
    }
}