package com.company;

import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double cost;
        double totalCost = 0;

        boolean gotAVal = SafeInput.getYNConfirm(in, "Would you like to continue?");

        while (gotAVal)
        {
            cost = SafeInput.getRangedDouble (in, "What is the price of the item?", 0.50, 9.99);
            totalCost = cost + totalCost;
            gotAVal = SafeInput.getYNConfirm(in, "Would you like to continue?");
        }

        System.out.printf ("\nThe total cost is: $%.2f", totalCost);
    }
}

//do
//        {
//        if (response.equalsIgnoreCase("Y"))
//        {
//        cost = SafeInput.getRangedDouble (in, "What is the price of the item?", 0.50, 9.99);
//        gotAVal = true;
//        totalCost = cost + totalCost;
//        }
//        else if (response.equalsIgnoreCase("N"))
//        {
//        System.out.print("Thank you!");
//        gotAVal = false;
//        }
//        else
//        {
//        System.out.println("You have entered an invalid answer: " + response + "Please enter a valid answer [Y/N].");
//        }
//
//        } while(!gotAVal);
