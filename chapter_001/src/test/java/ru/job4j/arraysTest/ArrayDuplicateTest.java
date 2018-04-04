package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.ArrayDuplicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
            String[] mas = {"10", "20", "20", "30", "40", "10", "20"};
            String[] expected = {"10", "20", "30", "40"};
            ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
            assertThat(arrayDuplicate.remove(mas), is(expected));
        }
    }
