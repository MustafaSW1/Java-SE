package com.IP_finder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
/*
Die Hauptidee dieses Codes ist es, den Benutzer nach einer Domain zu fragen,
 die IP-Adresse dieser Domain aufzulösen und dann die IP-Adresse auf der Konsole auszugeben.
 */
public class Main {

    public static void main(String[] args) {

        // Benutzer zur Eingabe einer Domain auffordern
        // Beispiel : google.com
        System.out.print("enter the domain :");
        Scanner in = new Scanner(System.in);
        String domain = in.nextLine();
        try {
            // IP-Adresse für die eingegebene Domain auflösen
            InetAddress address = InetAddress.getByName(domain);
            // IP-Adresse ausgeben
            System.out.print("the IP is : "+address);
        } catch (UnknownHostException e) {
            // Fehlerbehandlung für den Fall, dass die Domain nicht aufgelöst werden kann
            e.printStackTrace();
        }


    }
}
