package com.NewWork3_Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
Die Hauptidee dieses Codes besteht darin, eine Socket-Verbindung zu einem Server auf localhost:8899
herzustellen und dann eine bidirektionale Kommunikation zwischen Client und Server zu ermöglichen.
Der Client kann Nachrichten an den Server senden und auf eingehende Nachrichten vom Server warten,
die dann auf der Konsole ausgegeben werden.
 */
/*
Um den Code auszuführen:
Starten Sie die Main.class zuerst.
Starten Sie die Client.class.
Senden Sie die erste Nachricht vom Client an den Server in der Main-Klasse.
*/
public class Main {
    private static ServerSocket ss;
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // ServerSocket auf Port 8899 initialisieren
        ServerSocket ss = new ServerSocket(8899);
        System.out.println("Server is listening...");

        // Auf eingehende Verbindungen warten und akzeptieren
        Socket s = ss.accept();

        // Ausgangsstrom und Objektausgangsstrom initialisieren
        OutputStream out = s.getOutputStream();
        ObjectOutputStream oout = new ObjectOutputStream(out);

        // Eingangsstrom und Objekteingangsstrom initialisieren
        InputStream is = s.getInputStream();
        ObjectInputStream oin = new ObjectInputStream(is);

        // Eingabe von der Konsole
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String-Variablen für eingehende und ausgehende Nachrichten
        String r_msg, s_msg;

        // Endlosschleife für die Kommunikation zwischen Server und Client
        while (true) {
            // Auf Verbindung des Clients warten und eingehende Nachricht anzeigen
            System.out.println("waiting for client to connect...");
            if ((r_msg = (String) oin.readObject()) != null) {
                System.out.println("User says: " + r_msg);
            }

            // Nachricht an den Client senden
            System.out.println("to User:");
            s_msg = br.readLine();
            oout.writeObject(s_msg);
        }
    }
}
