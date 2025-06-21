package com.example.service;

import com.example.entity.orders;
import com.example.repository.repoClass;

public class serClass {
    private static repoClass repo = new repoClass();

    public void bubbleSort(orders order[]) {
        repo.bubbleSort(order);
    }

    public void quickSort(orders order[])
    {
        repo.quickSort(order);
    }
}
