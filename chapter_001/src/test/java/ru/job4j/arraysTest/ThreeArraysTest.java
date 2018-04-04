package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.ThreeArrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThreeArraysTest {
    @Test
    public void testForTwoArr() {
        int[] first = {10, 20, 30, 40, 42, 100};
        int[] second = {15, 20, 24, 35};
        int[] expected = {10, 15, 20, 20, 24, 30, 35, 40, 42, 100};
        ThreeArrays threeArrays = new ThreeArrays();
        assertThat(threeArrays.arrays(first, second), is(expected));
    }
}
