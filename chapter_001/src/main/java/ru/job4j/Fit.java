package ru.job4j;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    private final int MEN_INDEX = 100;
    private final int WOMEN_INDEX = 110;
    private final double MULTIPLIER = 1.15;
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - MEN_INDEX) * MULTIPLIER;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - WOMEN_INDEX) * MULTIPLIER;
    }
}