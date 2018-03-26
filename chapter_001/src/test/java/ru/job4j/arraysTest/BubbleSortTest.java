package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.BubbleSort;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        int[] unsortedArray = {5, 1, 3, 2, 4};
        int[] sortedArray = {1, 2, 3, 4, 5};
        BubbleSort bubble = new BubbleSort();
        assertThat(bubble.sort(unsortedArray), is(sortedArray));
    }
}
