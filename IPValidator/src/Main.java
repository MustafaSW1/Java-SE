//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Die Hauptidee dieses Codes besteht darin, ein Muster für gültige IPv4-Adressen zu definieren
und dann zu überprüfen, ob eine Liste von IP-Adressen diesem Muster entspricht oder nicht.
Der Code verwendet reguläre Ausdrücke, um die IP-Adressen zu validieren und gibt dann entsprechend aus
, ob sie gültig oder ungültig sind.
*/
public class Main {

    public static void main(String[] args) {
        // Definiere das Muster für gültige IPv4-Adressen
        String ip4pattern = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";

        // Erstelle ein Pattern-Objekt, das das IPv4-Muster enthält
        Pattern p = Pattern.compile(ip4pattern);

        // Liste der IP-Adressen, die überprüft werden sollen
        String[] ipNo = {"192.168.0.1", "192.168.0.2", "192.168.0.3", "192.168.0.4", "google.com"};
        for (String s : ipNo) {
            // Erstelle einen Matcher, um die Übereinstimmung mit dem Muster zu überprüfen
            Matcher m = p.matcher(s);
            // Überprüfe, ob die IP-Adresse mit dem Muster übereinstimmt und gib "valid" oder "invalid" aus
            System.out.println(s + " is: " + (m.matches() ? "valid" : "invalid"));
        }
    }
}