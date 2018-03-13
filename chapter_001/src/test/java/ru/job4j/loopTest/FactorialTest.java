package ru.job4j.loopTest;

import org.junit.Test;
import ru.job4j.loop.Factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();
        assertThat(factorial.fact(0), is(1));
        assertThat(factorial.fact(1), is(1));
        assertThat(factorial.fact(4), is(24));
        assertThat(factorial.fact(5), is(120));
    }
}
