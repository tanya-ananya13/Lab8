package com.company;

import java.util.Scanner;

public class FavNumber {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int singleDig = 0;

        singleDig = SafeInput.getInt(in, "Enter your favorite single digit number");

        System.out.println("\nYour favorite single digit number is " + singleDig);


        double doubleDig = 0;

        doubleDig = SafeInput.getDouble(in, "Enter your favorite double digit number");

        System.out.println("\nYour favorite double digit number is " + doubleDig);
    }
}
