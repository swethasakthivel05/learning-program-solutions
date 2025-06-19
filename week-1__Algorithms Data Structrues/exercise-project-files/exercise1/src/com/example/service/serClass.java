package com.example.service;

import com.example.repository.reposClass;

public class serClass {
    private static reposClass repo = new reposClass();

    public void addProduct(int id,String name,int quantity,double price)
    {
        repo.addProduct(id,name,quantity,price);
    }

    public void updateProduct(int id,String name,int quantity,double price)
    {
        repo.updateProduct(id, name, quantity, price);
    }

    public void deleteProduct(int id)
    {
        repo.deleteProduct(id);
    }
}
