package com.example.main;

import java.util.Scanner;

import com.example.service.serClass;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Main main = new Main();
    private static serClass ser = new serClass();

    public static void main(String args[]) {
        System.out.println();
        System.out.println("INVENTORY MANAGEMENT SYSTEM : ");
        System.out.println();
        boolean flag = true;
        while (flag) {
            System.out.println("1. Add Product Details");
            System.out.println("2. Update details");
            System.out.println("3. Delete a Product");
            System.out.println("4. Exit");
            System.out.print("Choose an Option : ");
            int option = sc.nextInt();
            System.out.println();

            sc.nextLine();
            switch (option) {
                case 1:
                    main.addProduct();
                    break;
                case 2:
                    main.updateProduct();
                    break;
                case 3:
                    System.out.print("Enter a product id to delete = ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    ser.deleteProduct(id);
                    break;
                case 4:
                    System.out.println("Successfully Exited...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
            System.out.println();
            System.out.println(
                    "***************************************************************************************************************");
            System.out.println();
        }
    }

    private void addProduct() {
        System.out.print("Enter the product id = ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Enter the product Name = ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Enter the number of quantity = ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Enter thr price of the product = ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        ser.addProduct(id, name, quantity, price);
    }

    private void updateProduct() {
        System.out.print("Enter the product id to update= ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Enter the product Name to update= ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Enter the number of quantity to update= ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Enter thr price of the product to update= ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        ser.updateProduct(id, name, quantity, price);
    }
}
