package com.aniket.arrays;

import java.util.Arrays;

public class IsArraySorted
{
    public static boolean isSorted(int arr[])
    {
        for(int i=1, prev=0;i<arr.length;i++,prev++)
        {
            if (arr[prev] > arr[i])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = {11,22,33,44,55};
        System.out.println(Arrays.toString(arr) + " is Sorted : " + isSorted(arr));
    }
}
