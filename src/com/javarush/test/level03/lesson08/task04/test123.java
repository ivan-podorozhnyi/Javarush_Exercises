package com.javarush.test.level03.lesson08.task04;

/**
 * Created by Ivan on 24.03.2016.
 */
import java.util.Arrays;

public class test123
{
    public static void main(String[] args)
    {
       int [] arr = {1,3,5,1,1,5,5};
        System.out.println(Arrays.toString(arr));
        for (int k=0; k<arr.length/2; k++ ){
            int tmp = arr[k];
            arr[k]=arr[arr.length - k -1];
            arr[arr.length -k-1] = tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
