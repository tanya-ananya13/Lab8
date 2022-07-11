package com.company;

import java.util.Scanner;

public class Reggie {

   static String menu = "O - Open S - Save V - View Q - Quit";

    public static void main(String[] args)
    {
	    Scanner in = new Scanner (System.in);

	    String displayMenu = "O - Open S - Save V- View Q -Quit";
	    String SSN;
	    String UCM;

        SSN = SafeInput.getRegExString (in, "What is your SSN?", "\\d{3}-\\d{2}-\\d{4}");
        UCM = SafeInput.getRegExString (in, "What is your UC Student M number?", "(M|m)\\d{5}");


        displayMenu();
	    String menuChoice = in.nextLine ();
	    menuChoice = menuChoice.toUpperCase ();

	    switch (menuChoice)
        {
            case "O":
                System.out.println ("Hello and welcome! Would you like to save new information for your SSN or UC Student M number?");
            case "S":
                SSN = SafeInput.getRegExString (in, "What is your SSN?", "\\d{3}-\\d{2}-\\d{4}");
                UCM = SafeInput.getRegExString (in, "What is your UC Student M number?", "(M|m)\\d{5}");
            case "V":
                System.out.println ("Your SSN is:" + SSN);
                System.out.println ("Your UC Student M number is: " + UCM);
            break;
            case "Q":
                System.out.println ("Goodbye!");
                System.exit (0);
            break;
        }

    }

    private static void displayMenu()
    {
        System.out.println (menu);
    }
}
