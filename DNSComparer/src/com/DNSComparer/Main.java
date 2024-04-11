package com.DNSComparer;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        // IP-Adressen für die Domains www.google.iq und www.google.us abrufen
        InetAddress iq = InetAddress.getByName("www.google.iq");
        InetAddress us = InetAddress.getByName("www.google.us");

        // Vergleicht die beiden IP-Adressen
        if (iq.equals(us)) {
            // Falls die IP-Adressen identisch sind, gibt "same" aus
            System.out.println("same");
        } else {
            // Falls die IP-Adressen unterschiedlich sind, gibt "not same" aus
            System.out.println("not the same");
        }
    }
}
