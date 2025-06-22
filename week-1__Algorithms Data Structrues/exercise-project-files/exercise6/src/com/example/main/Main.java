package com.example.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.example.entity.Book;
import com.example.service.SerClass;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static SerClass ser = new SerClass();

    public static void main(String args[]) {
        Book[] book1 = {
                new Book(1, "Pride and Prejudice", "Jane Austen"),
                new Book(2, "Adventure of Sherlock Homes", "Authur Conan Doyle"),
                new Book(3, "Tale of 2 cities", "Charles Dickens"),
                new Book(4, "War and Peace", "Leo Tolstoy"),
                new Book(5, "Odyssey", "Homer")
        };

        System.out.println("Linear Search : ");
        System.out.println();
        System.out.print("Enter the Book title to search : ");
        String name = sc.nextLine();
        System.out.println();
        Book result1 = ser.linear(book1, name);

        System.out.println();

        System.out.println(result1 != null ? "Title Found = " + result1 : "Title not found");

        Arrays.sort(book1, Comparator.comparing(p -> p.title.toLowerCase()));

        System.out.println();

        System.out.println("Binary Search : ");
        System.out.println();
        System.out.print("Enter the Book title to search : ");
        String name2 = sc.nextLine();
        Book result2 = ser.binary(book1, name2);

        System.out.println();

        System.out.println(result2 != null ? "Title Found = " + result2 : "Title not Found");

    }
}
