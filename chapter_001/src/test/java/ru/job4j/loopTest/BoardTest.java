package ru.job4j.loopTest;


import org.junit.Test;
import ru.job4j.loop.Board;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
}
