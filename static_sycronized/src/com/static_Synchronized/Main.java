package com.static_Synchronized;

// Table ist inner class
class Table{
    static void printing(int n) {
        // "synchronized" wird die 4 Threads in der richtigen Reihenfolge durchführen
        // Die 4 Threads sind in Main klasse.
        synchronized (Table.class) {
       // i <= 10 ist das multiplikationsfaktor.
       // n ist die Zahl ,dass die mit i multipliziert wird.
       // ACHTUNG : n werte sind unten in den Threads in Main klasse.
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * n);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> Table.printing(1));
        Thread t2 = new Thread(() -> Table.printing(10));
        Thread t3 = new Thread(() -> Table.printing(100));
        Thread t4 = new Thread(() -> Table.printing(1000));


        //threads durchführen
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}


