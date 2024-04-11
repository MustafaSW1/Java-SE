package com.Password;

import java.util.Scanner;

/*
Geben Sie in diesen Code zwei Passwörter ein,
Wenn die beiden Passwörter identisch sind, ist das Ergebnis True
 */
public class Main {

    public static void main(String[] args) {

		//Erstes Passwort eingeben
    	System.out.println("Enter your password :");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		//Erstes Passwort nochmal eingeben
		System.out.println("Enter the password again :");
		Scanner in1 = new Scanner(System.in);
		String str1 = in1.nextLine();

		//Passwort überprüfen
		System.out.println(str.matches(str1));

    }
}
