package ru.job4j.loopTest;

import org.junit.Test;
import ru.job4j.loop.Pyramid;

import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class PyramidTest {
    @Test
    public void whenPyramid4Right() {
        Pyramid pyramid = new Pyramid();
        String rst = pyramid.paintRight(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }


    @Test
    public void whenPyramid4Left() {
        Pyramid pyramid = new Pyramid();
        String rst = pyramid.paintLeft(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenPyramid4() {
        Pyramid pyramid = new Pyramid();
        String rst = pyramid.paintPyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}