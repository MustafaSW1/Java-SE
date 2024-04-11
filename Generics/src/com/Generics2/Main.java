package com.Generics2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Erstellen einer ArrayList, die nur Strings aufnehmen kann
        ArrayList<String>list = new ArrayList<String>();
        // Hinzufügen von Strings zur ArrayList
        list.add("mustafa");
        list.add("ahmed");
        list.add("ibraheem");
        list.add("jawad");

        // Erstellen eines Iterators, um über die Elemente der ArrayList zu iterieren
        Iterator<String> it = list.iterator();
        // Schleife zum Durchlaufen der ArrayList mithilfe des Iterators
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
