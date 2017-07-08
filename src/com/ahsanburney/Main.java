package com.ahsanburney;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Write a program that outputs the string representation of numbers from 1 to n.

//    But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
//    For numbers which are multiples of both three and five output “FizzBuzz”.


    public static void main(String[] args) {
	// write your code here

        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else
            if(i%3==0){
                System.out.println("Fizz");
            }else
            if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }


        System.out.println("=======Another Solution==============");

        System.out.println(fizzBuzz(100));

    }



        public static List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    list.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    list.add("Fizz");
                } else if (i % 5 == 0) {
                    list.add("Buzz");
                } else {
                    list.add(String.valueOf(i));
                }
            }
            return list;
        }

    }


