package com.example.repository;

import com.example.entity.Book;

public class RepoClass {
    public Book linear(Book book[], String name) {
        for (Book b : book) {
            if (b.title.equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }

    public Book binary(Book book[], String name) {
        int left = 0;
        int right = book.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = book[mid].title.compareTo(name);
            if (cmp == 0) {
                return book[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
