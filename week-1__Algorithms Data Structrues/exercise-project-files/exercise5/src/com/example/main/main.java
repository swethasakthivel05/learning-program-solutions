package com.example.main;

import java.util.Scanner;

import com.example.service.serClass;

public class main {
    private static Scanner sc = new Scanner(System.in);
    private static main main = new main();
    private static serClass ser = new serClass();

    public static void main(String args[]) {
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Task Management System : ");
            System.out.println();
            System.out.println("1. Add Task");
            System.out.println("2. Search a Task");
            System.out.println("3. Display all Task");
            System.out.println("4. Delete a Task");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter a option/choice = ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (n) {
                case 1:
                    main.addTask();
                    break;

                case 2:
                    main.searchTask();
                    break;

                case 3:
                    main.display();
                    break;

                case 4:
                    main.delete();
                    break;

                case 5:
                    System.out.println("Logged out...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
            System.out.println();
        }
    }

    private void addTask() {
        System.out.print("Enter the task id = ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the task name = ");
        String task = sc.nextLine();
        ser.addTask(n, task);
    }

    private void searchTask() {
        System.out.print("Enter the task id = ");
        int id = sc.nextInt();
        sc.nextLine();
        ser.searchTask(id);
    }

    private void display()
    {
        ser.display();
    }

    private void delete()
    {
        System.out.print("Enter the task id = ");
        int n = sc.nextInt();
        sc.nextLine();
        ser.delete(n);
    }
}
