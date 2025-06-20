package com.example.main;

import java.util.Scanner;

import com.example.service.serClass;

public class main {
    private static serClass ser = new serClass();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println();
        System.out.println("To calculate Future Value : ");
        System.out.println();
        System.out.print("Enter the name of the product = ");
        String pro = sc.nextLine();
        System.out.print("Enter the initial price = ");
        Double price = sc.nextDouble();
        System.out.print("Enter the growth rate (in %) = ");
        int rate = sc.nextInt();
        System.out.print("Enter the number of years = ");
        int years = sc.nextInt();
        System.out.println();

        Double rateCon = (double) rate / 100;

        Double ans = ser.finalValue(price, rateCon, years);

        System.out.println();
        System.out.printf("The Final Price of %s is %.2f\n", pro, ans);
        System.out.println();
    }
}
