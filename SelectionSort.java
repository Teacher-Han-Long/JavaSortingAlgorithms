package com.teacherhanlong;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
       ArrayList<Integer> sortedList = new ArrayList<>();
       int length = list.size();
       for(int i = 0; i < length; i++) {
           int indexToMove = indexOfMin(list);
           int min = list.get(indexToMove);
           list.remove(indexToMove);
           sortedList.add(min);
       }
       return sortedList;
    }

    static int indexOfMin(ArrayList<Integer> list) {
        int minIndex = 0;
        int length = list.size();
        for(int i = 0; i < length; i++) {
            if(list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30, 20, 25, 10, 15, 5, 50));
        System.out.println(selectionSort(list));
    }
}
