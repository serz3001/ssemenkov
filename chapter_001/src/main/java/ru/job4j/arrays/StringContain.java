package ru.job4j.arrays;


public class StringContain {
    private char[] data;

    public StringContain(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверка, что одно слово находится в другом слове.
     * @param sub слово, которое ищем в @data.
     * @return true если sub одержится в data
     */
    public boolean contains(String sub) {
        boolean result = false;
        char[] valueSub = sub.toCharArray();
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == valueSub[j]) {
                if (j < valueSub.length- 1) j++;
                else {
                    result = true;
                    break;
                }
            }
            else j = 0;

        }

        return result;
    }
}