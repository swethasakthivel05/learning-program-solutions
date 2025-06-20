package com.example.service;

import com.example.repository.repoClass;

public class serClass {
    private static repoClass repo = new repoClass();

    public Double finalValue(Double initialPrice,Double rate,int years)
    {
        return repo.finalValue(initialPrice, rate, years);
    }
}
