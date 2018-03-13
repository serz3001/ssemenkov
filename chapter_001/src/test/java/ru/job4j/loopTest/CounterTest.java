package ru.job4j.loopTest;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {
    @Test
    public void countTest() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));
    }
}
