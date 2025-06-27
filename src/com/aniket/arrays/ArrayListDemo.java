package com.aniket.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //Creating and Initializing ArrayList
        //Loose Coupling
        List<Integer> L = new ArrayList<>(Arrays.asList(99,88,77,66,55));

        //Display elements of ArrayList
        for(Integer a:L)
        {
            System.out.println(a);
        }
    }
}
