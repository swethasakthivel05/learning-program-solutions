package com.example.repository;

import com.example.entity.details;

public class repoClass {
    public static details linear(details detail[], String find) {
        for (details d : detail) {
            if (d.productName.equalsIgnoreCase(find)) {
                return d;
            }
        }
        return null;
    }

    public static details binary(details detail[],String find)
    {
        int left = 0;
        int right = detail.length-1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            int cmp = detail[mid].productName.compareToIgnoreCase(find);
            if(cmp == 0)
            {
                return detail[mid];
            }
            else if(cmp < 0)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return null;
    }
}
