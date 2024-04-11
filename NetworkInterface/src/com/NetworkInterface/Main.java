package com.NetworkInterface;

import java.io.IOException;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
/*
Die Hauptidee dieses Codes besteht darin, Informationen über die Netzwerkschnittstellen
des Computers abzurufen und sie auf der Konsole auszugeben
 */
public class Main {

    public static void main(String[] args)throws IOException {
        // Enumeration aller Netzwerkschnittstellen auf dem System erhalten
        Enumeration<NetworkInterface>nf = NetworkInterface.getNetworkInterfaces();
        // Schleife über alle Netzwerkschnittstellen
        while (nf.hasMoreElements()){
            NetworkInterface ni = nf.nextElement();
            netParameters(ni);
        }
    }
    // Methode zur Ausgabe von Netzwerkparametern einer gegebenen Netzwerkschnittstelle
    private static void netParameters(NetworkInterface ni) throws SocketException {
    System.out.println("Name :"+ni.getName());
        System.out.println("displayName :"+ni.getDisplayName());
        System.out.println("lo :"+ni.isLoopback());
        System.out.println("MUT :"+ni.getMTU());
        System.out.println("virtual :"+ni.isVirtual());
        System.out.println("pointToPoint"+ni.isPointToPoint());
        System.out.println("hardWareAddress :"+ni.getHardwareAddress());
        System.out.println("multiCast :"+ni.supportsMulticast());
        System.out.println("Active :"+ni.isUp());

        // Liste der Schnittstellenadressen erhalten
        List<InterfaceAddress>list =ni.getInterfaceAddresses();
        // Iterator über die Liste der Schnittstellenadressen
        Iterator<InterfaceAddress> iterator = list.iterator();
        while (iterator.hasNext()){
            InterfaceAddress ia = iterator.next();
            // Details zu den Schnittstellenadressen ausgeben
            System.out.println("getAddress :"+ia.getAddress());
            System.out.println("getNetworkPrefixLength :"+ia.getNetworkPrefixLength());
            System.out.println("getBroadcast :"+ia.getBroadcast());
            System.out.println(".......");
        }

    }
}
