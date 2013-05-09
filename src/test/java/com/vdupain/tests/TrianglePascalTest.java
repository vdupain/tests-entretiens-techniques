package com.vdupain.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TrianglePascalTest {
    PascalTriangle pascalTriangle = new PascalTriangle(5);

    @Test
    public void test1() {
        String actual = pascalTriangle.prettyPrint();
        String expected =
                        "1 \n" +
                        "1 1 \n" +
                        "1 2 1 \n" +
                        "1 3 3 1 \n" +
                        "1 4 6 4 1 \n" +
                        "1 5 10 10 5 1 \n";
        assertEquals(expected, actual);
    }

}
