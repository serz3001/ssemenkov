package ru.job4j;

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return this.max(first, second) > third ? this.max(first, second) : third;
    }
}
