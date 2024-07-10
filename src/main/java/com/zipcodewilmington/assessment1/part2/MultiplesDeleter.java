package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer>oddList = new ArrayList<>();
        for(Integer i : ints){
            if(i % 2!=0){
                oddList.add(i);
            }
        }

        Integer[] answer = oddList.toArray(new Integer[oddList.size()]);

        return answer;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        List<Integer>evenList = new ArrayList<>();
        for(Integer i : ints){
            if(i % 2==0){
                evenList.add(i);
            }
        }

        Integer[] answer = evenList.toArray(new Integer[evenList.size()]);

        return answer;


    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {


        List<Integer>threeList = new ArrayList<>();
        for(Integer i : ints){
            if(i % 3!=0){
                threeList.add(i);
            }
        }

        Integer[] answer = threeList.toArray(new Integer[threeList.size()]);

        return answer;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        List<Integer>nList = new ArrayList<>();
        for(Integer i : ints){
            if(i % multiple!=0){
                nList.add(i);
            }
        }

        Integer[] answer = nList.toArray(new Integer[nList.size()]);

        return answer;


    }
}
