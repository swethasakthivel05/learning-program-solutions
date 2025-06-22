package com.example.service;

import com.example.entity.Book;
import com.example.repository.RepoClass;

public class SerClass {
    private static RepoClass repo = new RepoClass();

    public Book linear(Book book[], String name) {
        return repo.linear(book, name);
    }

    public Book binary(Book book[], String name) {
        return repo.binary(book, name);
    }
}
