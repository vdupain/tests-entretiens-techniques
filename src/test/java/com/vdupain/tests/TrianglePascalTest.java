package com.vdupain.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TrianglePascalTest {
    PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    public void test1() {
        String actual = pascalTriangle.prettyPrint();
        String expected =
                "1 \n" +
                "1 1 \n" +
                "1 2 1 \n" +
                "1 3 3 1 \n" +
                "1 4 6 4 1 \n" +
                "1 5 10 10 5 1 \n" +
                "1 6 15 20 15 6 1 \n" +
                "1 7 21 35 35 21 7 1 \n" +
                "1 8 28 56 70 56 28 8 1 \n" +
                "1 9 36 84 126 126 84 36 9 1 \n" +
                "1 10 45 120 210 252 210 120 45 10 1 \n";

        assertEquals(expected, actual);
    }
}
