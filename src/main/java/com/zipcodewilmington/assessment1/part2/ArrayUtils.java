package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;

        for(Object c : objectArray){
            if(c.equals(objectToCount)){
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {



        List<Object> objects = new ArrayList<>();
        for(Object c : objectArray){
            if(!c.equals(objectToRemove)){
                objects.add(c);
            }

        }
        Object[] newObject = objects.toArray(new Object[objects.size()]);


        return newObject;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        Map<Object, Integer> counMap = new HashMap<>();//Hashmap to store count of each object

        //Iterate through array to count occurences of each object
        for(Object object : objectArray){
            if(counMap.containsKey(object)){
                counMap.put(object, counMap.get(object)+1);
            }
            else counMap.put(object, 1);
        }

        //Variables to track the most frequent object and its counts
        Object mostfreq = null;
        int maxCount = 0;

        //Iterate through the countMap to find the object with highest count
        for (Map.Entry<Object, Integer> entry : counMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostfreq = entry.getKey();
;            }
        }

        return mostfreq;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Map<Object, Integer> counMap = new HashMap<>();//Hashmap to store count of each object

        //Iterate through array to count occurences of each object
        for(Object object : objectArray){
            if(counMap.containsKey(object)){
                counMap.put(object, counMap.get(object)+1);
            }
            else counMap.put(object, 1);
        }

        //Variables to track the most frequent object and its counts
        Object minfreq = null;
        int minCount = Integer.MAX_VALUE;

        //Iterate through the countMap to find the object with highest count
        for (Map.Entry<Object, Integer> entry : counMap.entrySet()){
            if(entry.getValue() < minCount){
                minCount = entry.getValue();
                minfreq = entry.getKey();
                ;            }
        }



        return minfreq;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

    //Calculate the length of the resulting array
    int mergedLlength = objectArray.length + objectArray.length;

    //Create a new array with the calculated length
        Object[] mergedArray = new Object[mergedLlength];

    //Copy elements from objectArrayToAdd to mergedArray
    System.arraycopy(objectArray, 0, mergedArray, 0, objectArray.length);

    //Copy elements from objectArraytoAdd to mergedArry
        System.arraycopy(objectArrayToAdd, 0, mergedArray, objectArray.length, objectArray.length);


        return mergedArray ;
    }
}
