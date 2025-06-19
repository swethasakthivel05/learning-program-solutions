package com.example.service;

import com.example.entity.details;
import com.example.repository.repoClass;

public class serClass {
    private static repoClass repo = new repoClass();

    public static details linear(details detail[], String find) {
        return repo.linear(detail, find);
    }


    public static details binary(details detail[],String find)
    {
        return repo.binary(detail, find);
    }
}
