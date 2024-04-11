package com.HostInfoRetriever;

import java.io.IOException;
import java.net.InetAddress;
/*
Dieses Programm ruft und gibt grundlegende Informationen über
die IP-Adresse der Website "www.google.com" aus.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // IP-Adresse für www.google.com abrufen
        InetAddress id = InetAddress.getByName("www.google.com");

        System.out.println("getHostName : " + id.getHostName());
        System.out.println("getHostAddress : " + id.getHostAddress());
        System.out.println("getAddress : " + id.getAddress());
        System.out.println("isReachable : " + id.isReachable(200));
        System.out.println("getCanonicalHostName : " + id.getCanonicalHostName());
        System.out.println("isAnyLocalAddress : " + id.isAnyLocalAddress());
    }
}
