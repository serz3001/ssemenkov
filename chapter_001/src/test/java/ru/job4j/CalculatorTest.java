package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        calc.add(1.0, 1.0);
        double result = calc.getResult();
        double expected = 2.0;
        assertThat(result, is(expected));
    }
    @Test
    public void subtractTest() {
        Calculator calc = new Calculator();
        calc.subtract(2.0, 1.0);
        double result = calc.getResult();
        double expected = 1.0;
        assertThat(result, is(expected));
    }
    @Test
    public void divTest() {
        Calculator calc = new Calculator();
        calc.div(4.0, 2.0);
        double result = calc.getResult();
        double expected = 2.0;
        assertThat(result, is(expected));
    }
    @Test
    public void multipleTest() {
        Calculator calc = new Calculator();
        calc.multiple(2.0, 2.0);
        double result = calc.getResult();
        double expected = 4.0;
        assertThat(result, is(expected));
    }
}
