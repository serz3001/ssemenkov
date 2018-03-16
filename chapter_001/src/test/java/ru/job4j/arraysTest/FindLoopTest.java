package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.FindLoop;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FindLoopTest {
    @Test
    public void testFindTrue() {
        int[] mas = {10, 20, 30, 40, 50, 60};
        //System.out.println(mas.length);
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(mas, 20), is(1));
    }
    @Test
    public void testFindFalse() {
        int[] mas = {10, 20, 30, 40, 50, 60};
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(mas, 35), is(-1));
    }
}
