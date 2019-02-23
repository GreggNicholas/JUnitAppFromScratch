package com.example.junittestdrivendevelopment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayMethodTesting {


    private ArrayMethodTesting() {
    }

    private static ArrayMethodTesting ourInstance;

    public static ArrayMethodTesting getInstance() {
        if (ourInstance == null) {
            ourInstance = new ArrayMethodTesting();
        }
        return ourInstance;
    }


    public boolean isLessThan10(String[] input) {
        if (input == null) {
            return true;
        } else return input.length < 10;
    }

//    public String[] smallEvensOnly(String[] input) {
//     String[] newArray = new String[input.length - 1];
//
//     if(input.length % 2 == 0){
//         String largest = input[0];
//
//        for (int i = 0; i < input.length; i++) {
//            if (largest.length() < input.length ){
//            largest = input[i];
//            }
//        }
//
//         for (int i = 0; i < input.length ; i++) {
//             if (!input.length >)
//         }
//        }
//                }

    public char[] sortAlphabetically(char[] input) {
        Arrays.sort(input);
        return input;
    }


    public double returnSum(double[] input) {
        double sum = 0.0;
        for (int i = 0; i < sum; i++) {
            sum = +i;
        }
        return sum;
    }


    public Set<String> removeCaseSensitiveDuplicates(String[] input) {
        if (input == null) {
            return null;
        }
        final Set<String> uniqueValue = new HashSet<>();
        for (String value : input) {
            if (!uniqueValue.add(value.trim().toLowerCase())) ;
        }
        return uniqueValue;
    }

}

