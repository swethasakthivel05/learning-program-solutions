package com.example.main;

import java.util.Scanner;

import com.example.entity.employee;
import com.example.service.serClass;

public class main {
    private static serClass ser = new serClass();
    private static Scanner sc = new Scanner(System.in);
    private static main main = new main();

    public static void main(String args[]) {
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("EMPLOYEE MANAGEMENT SYSTEM : ");
            System.out.println();
            System.out.println("1. Add user");
            System.out.println("2. Search user by id");
            System.out.println("3. Traverse / Display all users");
            System.out.println("4. Delete user by id");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter your choice = ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println();
            switch (n) {
                case 1:
                    main.adduser();
                    break;

                case 2:
                    main.searchUser();
                    break;

                case 3:
                    main.display();
                    break;

                case 4:
                    main.delete();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }

    private void adduser() {
        System.out.print("Enter the userId = ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name = ");
        String name = sc.nextLine();
        System.out.print("Enter the position = ");
        String position = sc.nextLine();
        System.out.print("Enter the salary = ");
        double salary = sc.nextDouble();
        System.out.println();
        employee emp = new employee(id, name, position, salary);
        ser.adduser(emp);
    }

    private void searchUser() {
        System.out.print("Enter the user id to find = ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        ser.searchUser(n);
    }

    private void display() {
        ser.display();
    }

    private void delete() {
        System.out.print("Enter the id to delete = ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        ser.delete(n);
    }
}
