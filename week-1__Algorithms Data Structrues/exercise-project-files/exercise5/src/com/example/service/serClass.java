package com.example.service;

import com.example.repository.repoClass;

public class serClass {
    private static repoClass repo = new repoClass();

    public void addTask(int id, String task) {
        repo.addTask(id, task);
    }

    public void searchTask(int id) {
        repo.searchTask(id);
    }

    public void display() {
        repo.display();
    }

    public void delete(int id) {
        repo.delete(id);
    }
}
