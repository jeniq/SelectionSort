package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void selectionSort(int[] array, int start, int end){
        if (start < end){
            swap(array, start, min(array, start, end));
            selectionSort(array, start+1, end);
        }
    }

    public static int min(int[] array, int start, int end){
        int min = array[start];
        int pos = start;
        for (int i = start + 1; i < end; i++){
            if (array[i] < min){
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void swap(int[] array, int first, int second){
        int temp;
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
