package com.example.entity;

public class employee {
    private int empId;
    private String name;
    private String position;
    private double salary;

    public employee(int empId, String name, String position, double salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
