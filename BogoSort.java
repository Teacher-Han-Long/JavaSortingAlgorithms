package com.teacherhanlong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * The Downside to BogoSort is the only side.
 * Never gets closer to a solution and finds one by chance
 */
public class BogoSort {
    //create a new list of unsorted numbers
    //call bogoSort method and pass the list
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(72,25,64,45,33,78));
        bogoSort(list);
        System.out.println(list);
    }

    //calls isSorted() method and passes the list as arg
    //loops until isSorted() returns true
    static void bogoSort(ArrayList<Integer> list) {
        while(!isSorted(list)) {
            Collections.shuffle(list);
        }
    }

    static boolean isSorted(ArrayList<Integer> list) {
        for(int i=1; i < list.size(); i++) {
            if(list.get(i) < list.get(i-1)) {
                return false;
            }
        }
        return true;
    }
}