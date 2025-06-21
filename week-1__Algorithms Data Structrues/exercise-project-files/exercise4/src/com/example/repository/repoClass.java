package com.example.repository;

import com.example.entity.employee;

public class repoClass {
    private employee[] employees;
    private int count;

    public repoClass() {
        employees = new employee[10];
        count = 0;
    }

    private boolean isDupli(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpId() == id) {
                return true;
            }
        }
        return false;
    }

    public void adduser(employee e) {
        if (count >= employees.length) {
            System.out.println("Employee list is full..");
            System.out.println();
            return;
        } else if (isDupli(e.getEmpId())) {
            System.out.println("Employee already exist..");
            System.out.println();
            return;
        }
        employees[count++] = e;
        System.out.println("Successfully added..");
        System.out.println();
    }

    public void searchUser(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpId() == id) {
                System.out.println("ID Found : ");
                ;
                System.out.println(
                        "Id = " + employees[i].getEmpId() + "\t Name = " + employees[i].getName() + "\t Position = "
                                + employees[i].getPosition() + "\t Salary = " + employees[i].getSalary());
                return;
            }
        }
        System.out.println("Id not Found..");
    }

    public void display() {
        if (count == 0) {
            System.out.println("Employee list is empty!!...");
        } else {
            System.out.println("Id \t Name \t Position \t Salary");
            System.out.println("--------------------------------------------");
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i].getEmpId() + "\t" + employees[i].getName() + "\t"
                        + employees[i].getPosition() + "\t" + employees[i].getSalary());
            }
        }
    }

    public void delete(int id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee ID not found...");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--count] = null;
        System.out.println("Employee Id " + id + " successfully deleted.");
    }
}
