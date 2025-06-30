package com.aniket.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList
{
    public static void main(String[] args)
    {
        int arr[] = {11,22,33,44,55};

        List<Integer> mylist = convertToList(arr);
        System.out.println("Array to List Conversion : " + mylist);
    }

    private static List<Integer> convertToList(int[] arr)
    {
        List<Integer> L = new ArrayList<>();
        for(int j:arr)
        {
            L.add(j);
        }
        return L;
    }
}
