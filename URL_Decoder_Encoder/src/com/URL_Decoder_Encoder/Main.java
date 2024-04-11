package com.URL_Decoder_Encoder;

/*
Die Hauptidee dieses Codes besteht darin, eine URL mit UTF-8-Kodierung zu dekodieren und
die unveränderte sowie die dekodierte URL auszugeben.
 */
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main{

    public static void main(String[] args) throws UnsupportedEncodingException {

        // Die URL, die dekodiert werden soll
        String encodedURL = "https://asgoodasnew.de/Apple-MacBooks/MacBook-Pro/" +
                "MacBook-Pro-2017/Apple-MacBook-Pro-2017-13-Intel-Core-i5-2-30" +
                "-GHz-128-GB-SSD-8-GB-silber.html?listtype=search&searchparam=macbook%20";

        // Ausgabe der unveränderten URL
        System.out.println("Encoded URL: " + encodedURL);

        // Dekodieren der URL mit UTF-8-Kodierung
        String decodedURL = URLDecoder.decode(encodedURL, "UTF-8");

        // Ausgabe der dekodierten URL
        System.out.print("Decoded URL: " + decodedURL);
    }
}