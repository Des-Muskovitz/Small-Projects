package com.projects.numbers;

import java.util.Scanner;

public class Numbers {

    public static void findPiToTheNthDigit(){
        Scanner in = new Scanner(System.in);
        final int MAX_DIGITS = 20;

        System.out.print("How many digits of PI would you like to display (Max of 20 digits)? > ");
        int n = Integer.parseInt(in.nextLine());

        System.out.println(Math.PI);
    }

}
