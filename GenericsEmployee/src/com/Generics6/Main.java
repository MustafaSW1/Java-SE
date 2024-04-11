package com.Generics6;

import java.util.ArrayList;
import java.util.List;
/*
Der Code basiert auf Vererbung und generic
 */

// Die Aufgabe der Persons-Klasse ist es, eine abstrakte Methode bereitzustellen, die den Namen ausdruckt.
abstract class Persons {
    // name() Methode muss von Unterklassen implementiert werden.
    abstract void name();
}
/*
Die Employee1-Klasse implementiert die abstrakte Methode,
 um den Namen des ersten Mitarbeiters auszudrucken.
 (David)
 */

class Employee1 extends Persons {
    @Override
    void name() {
        System.out.println("David");
    }
}

/*
Die Employee2-Klasse implementiert die abstrakte Methode,
 um den Namen des zweiten Mitarbeiters auszudrucken.
 (Albert)
 */
class Employee2 extends Persons {

    @Override
    void name() {
        System.out.println("Albert");
    }
}

public class Main {

    // Methode zur Ausgabe der Namen der Mitarbeiter aus einer Liste von Personen
    public static void employeeName(List<? extends Persons>lists){
        for (Persons employee :lists) {
            employee.name();
        }
    }
    public static void main(String[] args) {

        // Liste von Employee1-Objekten erstellen
        List<Employee1>m1 = new ArrayList<Employee1>();
        m1.add(new Employee1());  //m1 ist ein Objekt von Employee1-klasse

        // Liste von Employee1-Objekten erstellen
        List<Employee2>m2 = new ArrayList<>();
        m2.add(new Employee2());  //m2 ist ein Objekt von Employee2-klasse

        // Die Methode aufrufen, um die Namen der Mitarbeiter auszugeben
        employeeName(m1); // Namen der Mitarbeiter aus der Liste m1 ausgeben
        employeeName(m2); // Namen der Mitarbeiter aus der Liste m2 ausgeben
    }
}
