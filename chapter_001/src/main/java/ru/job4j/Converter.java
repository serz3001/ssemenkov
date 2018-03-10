package ru.job4j;
/**
 * Корвертер валюты.
 */
public class Converter {
    private final int DOLLAR_COURSE = 60;
    private final int EURO_COURSE = 70;
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/EURO_COURSE;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value/DOLLAR_COURSE;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return Евро.
     */
    public int euroToRuble(int value) {
        return value*EURO_COURSE;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Доллары
     */
    public int dollarToRuble(int value) {
        return value*DOLLAR_COURSE;
    }
}

