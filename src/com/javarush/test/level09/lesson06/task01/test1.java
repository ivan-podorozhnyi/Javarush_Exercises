package com.javarush.test.level09.lesson06.task01;

/**
 * Created by Ivan on 06.04.2016.
 */

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class test1 {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String ans="";
            if(n%2==1){
                ans = "Weird";
            }
            else if((n%2==0)&&(n>=2)&&(n<=5)){
                ans = "Not Weird";
                //Complete the code
            }
            else if((n%2==0)&&(n>=6)&&(n<=20)){
                ans = "Weird";
                //Complete the code
            }
            else if((n%2==0)&&(n>20)){ans = "Not Weird";}

            System.out.println(ans);

        }
    }

