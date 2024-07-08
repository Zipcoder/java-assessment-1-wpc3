package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int n = input.length();

        for (int i =0; i<(n/2); ++i){
            if(input.charAt(i) != input.charAt(n-i-1)){
                return null;
            }

        }


        return n*2 ;
    }
}
