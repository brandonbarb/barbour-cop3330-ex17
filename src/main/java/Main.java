/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a 1 if you are male or a 2 if you are female? ");
        Scanner input = new Scanner(System.in);
        int gender = input.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int alc = input.nextInt();
        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        double hours = input.nextDouble();
        double r;

        if (gender == 1) {
            r = 0.73;
        }
        else {
            r = 0.67;
        }

        double bac = (alc * 5.14 / weight * r) - .015 * hours;
        System.out.printf("\nYour BAC is %f\n", bac);

        String not = "";
        if (bac >= 0.08) {
            not = "not ";
        }
        System.out.printf("It is %slegal for you to drive.\n", not);
    }
}
