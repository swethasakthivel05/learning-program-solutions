package com.example.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.example.entity.details;
import com.example.service.serClass;

public class main {

    private static serClass ser = new serClass();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        details[] product = {
                new details(1, "lehenga", "dress"),
                new details(2, "apsara", "pencil"),
                new details(3, "ring", "ornaments"),
                new details(4, "bat", "sports"),
                new details(5, "frock", "dress")

        };

        System.out.println("Linear Search : ");

        System.out.print("Enter the product name to search : ");

        String pro1 = sc.nextLine();

        details result1 = ser.linear(product, pro1);

        System.out.println(result1 != null ? "Product Found = " + result1 : "Product Not Found");

        Arrays.sort(product, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("Binary Search : ");

        System.out.println("Enter the product name to search : ");

        String pro2 = sc.nextLine();

        details result2 = ser.binary(product, pro2);

        System.out.println(result2 != null ? "Product Found = " + result2 : "Product not found");
    }

}
