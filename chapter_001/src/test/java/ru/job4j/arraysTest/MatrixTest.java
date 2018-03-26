package ru.job4j.arraysTest;

import org.junit.Test;
import ru.job4j.arrays.Matrix;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void testMatrix() {
        Matrix matr = new Matrix();
        int [][] mult = {{1, 2, 3, 4, 5},
                                {2, 4, 6, 8, 10},
                                    {3, 6, 9, 12, 15},
                                        {4, 8, 12, 16, 20},
                                            {5, 10, 15, 20, 25}};
        assertThat(matr.multiple(5), is(mult));
    }
}
