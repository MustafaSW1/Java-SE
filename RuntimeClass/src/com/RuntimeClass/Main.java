package com.RuntimeClass;

/*
ie Hauptidee dieses Codes ist es, Informationen über den verfügbaren Speicher in der Java-Laufzeitumgebung zu erhalten
und diese auszugeben. Dabei wird der insgesamte Speicher, der freie Speicher und der maximal verfügbare Speicher angezeigt.
Außerdem wird der Garbage Collector aufgerufen, um nicht mehr benötigten Speicher freizugeben,
und anschließend wird erneut der freie Speicher angezeigt.
 */


public class Main {

    public static void main(String[] args) throws Exception {

        // Holen Sie sich die Laufzeitumgebung
        Runtime m = Runtime.getRuntime();

        // Ausgabe des insgesamten Speichers
        System.out.println("memory = " + m.totalMemory() + " Bytes");

        // Ausgabe des freien Speichers
        System.out.println("free memory = " + m.freeMemory() + " Bytes");

        // Ausgabe des maximalen verfügbaren Speichers
        System.out.println("Max memory = " + m.maxMemory() + " Bytes");

        // Aufrufen des Garbage Collectors
        System.gc();

        // Ausgabe des freien Speichers nach dem Aufrufen des Garbage Collectors
        System.out.println("free memory after gc = " + m.freeMemory() + " Bytes");
    }

}
