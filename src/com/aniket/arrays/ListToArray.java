package com.aniket.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray
{
    public static void main(String[] args)
    {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(11,22,33,44,55));

        int arr[] = ConvertToArray(mylist);
        System.out.println("List to Array Conversion : " + Arrays.toString(arr));
    }

    private static int[] ConvertToArray(List<Integer> mylist)
    {
        int[] array = new int[mylist.size()];
        int j = 0;
        for(int i:mylist)
        {
            array[j] = i;
            j++;
        }

        return array;
    }
}
