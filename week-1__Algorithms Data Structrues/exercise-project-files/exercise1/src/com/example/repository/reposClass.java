package com.example.repository;

import java.util.HashMap;

import com.example.entity.productDetails;

public class reposClass {
    private static HashMap<Integer, productDetails> map = new HashMap<>();
    private static reposClass repo = new reposClass();

    public void addProduct(int id, String name, int quantity, double price) {
        if (map.containsKey(id)) {
            System.out.println("Product already exists");
        } else {
            productDetails pro = new productDetails(id, name, quantity, price);
            map.put(id, pro);
            System.out.println("Product Added Successfully");
            System.out.println();
            repo.displayAll();
        }
    }

    public void updateProduct(int id, String name, int quantity, double price) {
        if (map.containsKey(id)) {
            productDetails pro = map.get(id);
            pro.setProductName(name);
            pro.setQuantity(quantity);
            pro.setPrice(price);
            System.out.println("Product updated successfully");
            System.out.println();
            repo.displayAll();
        } else {
            System.out.println("Invalid product id");
            System.out.println();
        }
    }

    public void deleteProduct(int id)
    {
        if(map.containsKey(id))
        {
            map.remove(id);
            System.out.println("Deleted Successfully");
            System.out.println();
            repo.displayAll();
        }
        else
        {
            System.out.println("Id not found");
        }
    }

    private void displayAll() {
        System.out.println("Inventory : ");
        System.out.println("ID \t PRO_NAME   \t QUANTITY \t  PRICE");
        System.out.println("__________________________________________________________________________");
        for (productDetails pro : map.values()) {
            System.out.println(pro.getProductId() + "\t" + pro.getProductName() + "\t\t" + pro.getQuantity() + "\t\t"
                    + pro.getPrice());
            System.out.println("------------------------------------------------------------------------");
        }
        System.out.println("_________________________________________________________________________");
    }

}
