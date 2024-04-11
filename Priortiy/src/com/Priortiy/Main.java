package com.Priortiy;
//public static int MIN_PRIORITY
//public static int NORMAL_PRIORITY
//public static int MAX_PRIORITY

/*
Die Hauptidee dieses Codes besteht darin, die Priorität von Threads in Java zu demonstrieren.
 Zwei Threads werden erstellt, wobei einer die maximale Priorität hat und der andere die normale Priorität.
 Durch Ausgabe von Nachrichten wird gezeigt, wie sich die Prioritäten auf die Reihenfolge der
 Thread-Ausführung auswirken können.
 */
public class Main extends Thread{
    public static void main(String[] args) {
        // Thread 1 mit maximaler Priorität
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: MAX PRIORITY");
            // Hier fügen Sie den Code hinzu, den Thread 1 ausführen soll
        });
        thread1.setPriority(Thread.MAX_PRIORITY);

        // Thread 2 mit normaler Priorität
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: NORMAL PRIORITY");
            // Hier fügen Sie den Code hinzu, den Thread 2 ausführen soll
        });
        thread2.setPriority(Thread.NORM_PRIORITY);

        // Starten Sie Thread 1
        thread1.start();

        // Warten, bis Thread 1 abgeschlossen ist
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Starten Sie Thread 2, nachdem Thread 1 beendet wurde
        thread2.start();
    }
}
