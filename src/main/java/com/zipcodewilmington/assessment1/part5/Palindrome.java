package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int size = input.length();
        int count = size;
        for(int i=0; i<size; i++){
            for(int j=i+2; j<=size; j++){
                String value = input.substring(i,j);
                String reverse = new StringBuilder(value).reverse().toString();
                if(value.equals(reverse)){
                    count++;
                }
            }
        }

//        int n = input.length();
//
//        for (int i =0; i<(n/2); ++i){
//            if(input.charAt(i) != input.charAt(n-i-1)){
//                return null;
//            }
//
//        }


        return count ;
    }
}
