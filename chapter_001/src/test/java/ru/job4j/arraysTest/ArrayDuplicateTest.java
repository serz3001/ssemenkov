package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.ArrayDuplicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
            String[] mas = {"10", "20", "20", "30", "40", "10", "20"};
            String[] turnedMas = {"10", "20", "30", "40"};
            ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
            assertThat(arrayDuplicate.remove(mas), is(turnedMas));
        }
    }
