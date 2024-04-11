package com.NewWork3_Chat;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Socket-Verbindung zum Server auf localhost:8899 herstellen
        Socket s = new Socket("localhost", 8899);
        System.out.println("Connected");

        // Eingangsstrom und Objektausgangsstrom initialisieren
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        // Eingabe von der Konsole
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String-Variablen für eingehende und ausgehende Nachrichten
        String r_msg, s_msg;

        // Endlosschleife für die Kommunikation zwischen Client und Server
        while (true) {
            // Nachricht an den Server senden
            System.out.println("to Server:");
            s_msg = br.readLine();
            oos.writeObject(s_msg);

            // Auf eingehende Nachricht vom Server warten und anzeigen
            System.out.println("waiting for connection...");
            if ((r_msg = (String) ois.readObject()) != null) {
                System.out.println("Server says: " + r_msg);
            }
        }
    }
}
