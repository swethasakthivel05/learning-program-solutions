package com.example.repository;

import com.example.entity.orders;

public class repoClass {
    public void bubbleSort(orders order[]) {
        int n = order.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (order[j].getTotPrice() > order[j + 1].getTotPrice()) {
                    orders temp = order[j];
                    order[j] = order[j + 1];
                    order[j + 1] = temp;
                }
            }
        }
    }

    public int quick(orders order[], int low, int high) {
        double val = order[low].getTotPrice();
        int i = low;
        int j = high;
        while (i < j) {
            while (order[i].getTotPrice() <= val && i <= high - 1) {
                i++;
            }
            while (order[j].getTotPrice() > val && j >= low + 1) {
                j--;
            }
            if (i < j) {
                orders temp = order[i];
                order[i] = order[j];
                order[j] = temp;
            }
        }

        orders temp = order[low];
        order[low] = order[j];
        order[j] = temp;

        return j;
    }

    public void qS(orders order[], int low, int high) {
        if (low < high) {
            int pivot = quick(order, low, high);
            qS(order, low, pivot - 1);
            qS(order, pivot + 1, high);
        }
    }

    public void quickSort(orders order[]) {
        qS(order, 0, order.length - 1);
    }
}
