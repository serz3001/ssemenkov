package ru.job4j.arrays;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].equals(array[j+1])) {
                    array[j+1] = "00000";
                }
            }
        }
        int count = 0; //подсчитывает количество пустых значений в массиве
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j].equals("00000")) {
                    array[j] = array[j + 1];
                    array[j + 1] = "00000";
                    count++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - count + 1);
    }
}