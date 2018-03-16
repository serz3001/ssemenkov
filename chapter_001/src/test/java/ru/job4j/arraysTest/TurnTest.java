package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.Turn;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void testEvenArr() {
        int[] mas = {10, 20, 30, 40};
        int[] turnedMas = {40, 30, 20, 10};
        Turn turn = new Turn();
        assertThat(turn.arrayTurn(mas), is(turnedMas));
    }
    @Test
    public void testOddArr() {
        int[] mas = {10, 20, 30, 40, 50};
        int[] turnedMas = {50, 40, 30, 20, 10};
        Turn turn = new Turn();
        assertThat(turn.arrayTurn(mas), is(turnedMas));
    }
}
