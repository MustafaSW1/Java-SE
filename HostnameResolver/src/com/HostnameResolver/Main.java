package com.HostnameResolver;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
Der Code löst die IP-Adresse von www.apple.com auf
 */
public class Main {

    public static void main(String[] args) {

        try {
            // Hostnamenauflösung für "www.apple.com" durchführen
            InetAddress []addresses = InetAddress.getAllByName("www.apple.com");
            // Für jede aufgelöste IP-Adresse des Hostnamens
            for (int i = 0; i < addresses.length; i++) {
                System.out.println(addresses[i]);
            }
        } catch (UnknownHostException e) {
            // die Fehlermeldung "can not find any think ...." ausgeben
            System.out.println("can not find any think ....");
        }
    }
}
