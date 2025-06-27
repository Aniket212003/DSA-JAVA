package com.aniket.arrays;

public class ArrayDemo
{
    public static void main(String[] args)
    {
        //Array Initialization
        //Type 1
        int a[] = {11,22,33};

        //Type 2
        int arr[] = new int[] {11,22,33};

        //Array iteration
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i + ":" + a[i]);
            System.out.println(i + ":" + arr[i]);
        }

    }
}
