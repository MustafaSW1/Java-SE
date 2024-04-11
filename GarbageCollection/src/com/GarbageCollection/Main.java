package com.GarbageCollection;

public class Main {

    public void finalize() {
        System.out.println("GC"); // Ausgabe "GC", um anzuzeigen, dass das Objekt zerstört wird
    }

    public static void main(String[] args) {
        Main m = new Main();
        Main m1 = new Main();

        m = null;
        m1 = null;

        System.gc(); // Ein expliziter Aufruf des Garbage Collectors wird gemacht, um nicht mehr verwendete Objekte einzusammeln
    }
}
