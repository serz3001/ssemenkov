package ru.job4j.arrays;

/**
 * Дано два отсортированных массива. Необходимо их объединить в третий массив так, чтобы он был отсортирован
 */
public class ThreeArrays {
    public int[] arrays(int[] first, int second[]) {
        int[] result = new int[first.length + second.length];
        int k = 0;
        int n = 0;
        for (int i = 0; i < (first.length + second.length); i++) {
            if(k < first.length && n < second.length) {
                if (first[k] < second[n]) {
                    result[i] = first[k];
                    k++;
                }
                else {
                    result[i] = second[n];
                    n++;
                }
            }
            else if (k < first.length && n >= second.length) {
                result[i] = first[k];
                k++;
            }
            else if (k >= first.length && n < second.length) {
                result[i] = second[n];
                n++;
            }
        }
        return result;
    }
}
