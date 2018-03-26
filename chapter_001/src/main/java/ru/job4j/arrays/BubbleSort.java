package ru.job4j.arrays;

public class BubbleSort {
    public int[] sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    /*public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int[] mas = {5, 1, 3, 2, 4};
        mas = bubble.sort(mas);
        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
        }*/
    }
