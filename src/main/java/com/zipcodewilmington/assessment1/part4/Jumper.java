package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if(k < j){
            return k;
        }

        else if (k % j == 0) {
            return k / j;
        } else {

            return k / j + 1;
        }

    }
}