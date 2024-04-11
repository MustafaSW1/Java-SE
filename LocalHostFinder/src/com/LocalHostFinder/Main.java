package com.LocalHostFinder;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
Dieser Code ruft die lokale IP-Adresse des Computers ab
 */
public class Main {

    public static void main(String[] args) {
        // Deklaration einer Variablen address vom Typ InetAddress, um die lokale IP-Adresse zu halten
        InetAddress address = null;
        try {
            // Versucht, die lokale IP-Adresse zu erhalten
            address = InetAddress.getLocalHost();
            // Gibt die lokale IP-Adresse auf der Konsole aus
            System.out.println(address);
        } catch (UnknownHostException e) {
            // Behandelt den Fall, dass die lokale IP-Adresse nicht gefunden werden kann
            System.out.println("can not find the local address ");
        }
    }
}
