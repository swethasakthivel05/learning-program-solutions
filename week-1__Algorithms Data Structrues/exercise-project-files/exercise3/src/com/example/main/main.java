package com.example.main;

import com.example.entity.orders;
import com.example.service.serClass;

public class main {
    private static serClass ser = new serClass();

    public static void main(String args[]) {
        orders[] order = {
                new orders(101, "Sasi", 504.35),
                new orders(102, "Preethi", 635.21),
                new orders(103, "Arun", 7852.26),
                new orders(104, "Geetha", 526.99),
                new orders(105, "Lio", 8963.206)
        };
        System.out.println();
        System.out.println("Bubble Sort(Total Price) : ");
        System.out.println();
        System.out.println("Before bubble sort : ");
        for (orders it : order) {
            System.out.println(it.getOrderId() + "\t" + it.getCustomerName() + "\t" + it.getTotPrice());
        }
        System.out.println();
        System.out.println("After bubble sort : ");

        ser.bubbleSort(order);

        for (orders it : order) {
            System.out.println(it.getOrderId() + "\t" + it.getCustomerName() + "\t" + it.getTotPrice());
        }

        System.out.println();

        orders[] order1 = {
                new orders(106, "Sahu", 784.35),
                new orders(107, "Riya", 665.21),
                new orders(108, "Anu", 852.26),
                new orders(109, "Kiya", 526.99),
                new orders(110, "Ben", 963.206)
        };

        System.out.println("Quick Sort(Total Price) : ");
        System.out.println();
        System.out.println("Before quick sort : ");
        for (orders it : order1) {
            System.out.println(it.getOrderId() + "\t" + it.getCustomerName() + "\t" + it.getTotPrice());
        }
        System.out.println();
        System.out.println("After quick sort : ");

        ser.quickSort(order1);

        for (orders it : order1) {
            System.out.println(it.getOrderId() + "\t" + it.getCustomerName() + "\t" + it.getTotPrice());
        }
    }
}
