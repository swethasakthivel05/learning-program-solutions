package com.example.repository;

public class repoClass {
    public Double finalValue(Double initialPrice, Double rate, int years) {
        if (years == 0) {
            return initialPrice;
        }

        return (1 + years) * finalValue(initialPrice, rate, years - 1);
    }
}
