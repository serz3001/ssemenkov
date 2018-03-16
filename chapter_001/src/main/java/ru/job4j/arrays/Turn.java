package ru.job4j.arrays;

public class Turn {
    public int[] arrayTurn(int arr[]){
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
