package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.ArrayChar;
import ru.job4j.arrays.StringContain;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringContaintTest {
    @Test
    public void testStringContains() {
        StringContain word = new StringContain("Hello");
        boolean result = word.contains("ello");
        assertThat(result, is(true));
    }

    @Test
    public void testStringNotContains() {
        StringContain word = new StringContain("Hello");
        boolean result = word.contains("Hi");
        assertThat(result, is(false));
    }
}