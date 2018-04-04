package ru.job4j.arrays;

/**
 * Дано два отсортированных массива. Необходимо их объединить в третий массив так, чтобы он был отсортирован
 */
public class ThreeArrays {
    public int[] arrays(int[] first, int second[]) {
        int[] result = new int[first.length + second.length];
        int i = 0;
        int firstInd = 0;
        int secondInd = 0;
        while ((firstInd < first.length) && (secondInd < second.length) && (i < (first.length + second.length))) {
                if (first[firstInd] < second[secondInd])
                    result[i++] = first[firstInd++];
                else
                    result[i++] = second[secondInd++];
        }
        if (firstInd < first.length && secondInd >= second.length)
            System.arraycopy(first, firstInd, result, i, (first.length + second.length) - i);
        else if (firstInd >= first.length && secondInd < second.length)
            System.arraycopy(second, second[secondInd], result, result[i], (first.length + second.length) - i);
        return result;
    }
}
