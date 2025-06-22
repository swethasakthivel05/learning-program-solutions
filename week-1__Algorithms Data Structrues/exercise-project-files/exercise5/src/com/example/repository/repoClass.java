package com.example.repository;

import com.example.entity.task;

public class repoClass {
    private class Node {
        task data;
        Node next;

        Node(task data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(int id, String task) {
        if (isduplicate(id)) {
            System.out.println();
            System.out.println("Task already exists....");
            return;
        }

        boolean status = false;
        task newtask = new task(id, task, status);
        Node newNode = new Node(newtask);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println();
        System.out.println("Task added Successfully...");
    }

    private boolean isduplicate(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getId() == id) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void searchTask(int id) {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            if (temp.data.getId() == id) {
                System.out.println("Task found.");
                System.out.println("Id = " + temp.data.getId() + "\t TaskName = " + temp.data.getTaskName()
                        + "\t Status = " + temp.data.isStatus());
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void display() {
        System.out.println();
        if (head == null) {
            System.out.println("No Task Available...");
        } else {
            Node temp = head;
            System.out.println("Id \t TaskName \t Status");
            System.out.println("----------------------------------------------");
            while (temp != null) {
                System.out.println(temp.data.getId() + "\t" + temp.data.getTaskName() + "\t\t" + temp.data.isStatus());
                temp = temp.next;
            }
        }
    }

    public void delete(int id) {
        System.out.println();
        if (head == null) {
            System.out.println("No task Available.");
            return;
        }

        if (!isduplicate(id)) {
            System.out.println("Task id not Available...");
            return;
        }

        if (head.data.getId() == id) {
            head = head.next;

        } else {
            Node prev = head;
            Node curr = head.next;

            while (curr != null) {
                if (curr.data.getId() == id) {
                    prev.next = curr.next;
                    break;
                }
                prev = prev.next;
                curr = curr.next;
            }
        }
        System.out.println("Task deleted Successfully..");
    }
}
