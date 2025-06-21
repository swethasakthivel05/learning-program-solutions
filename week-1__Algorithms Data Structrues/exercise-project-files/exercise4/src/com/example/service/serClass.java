package com.example.service;

import com.example.entity.employee;
import com.example.repository.repoClass;

public class serClass {
    private static repoClass repo = new repoClass();

    public void adduser(employee e) {
        repo.adduser(e);
    }

    public void searchUser(int id) {
        repo.searchUser(id);
    }

    public void display() {
        repo.display();
    }

    public void delete(int id) {
        repo.delete(id);
    }
}
