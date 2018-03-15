package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.Square;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SquareTest {
    @Test
    public void testFor3elementsTrue() {
        Square square = new Square();
        int[] mas = {1, 4, 9};
        assertThat(square.calculate(3), is(mas));
    }
}
