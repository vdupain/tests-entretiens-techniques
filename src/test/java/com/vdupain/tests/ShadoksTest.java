package com.vdupain.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ShadoksTest {
    Shadoks shadoks = new Shadoks();

    @Test
    public void testEncode() {
        assertEquals("GA", shadoks.encode(0));
        assertEquals("BU", shadoks.encode(1));
        assertEquals("ZO", shadoks.encode(2));
        assertEquals("MEU", shadoks.encode(3));
        assertEquals("ZOZOZO", shadoks.encode(42));
        assertEquals("BUZOBUGA", shadoks.encode(100));
    }

    @Test
    public void testDecode() {
        assertEquals(42, shadoks.decode("ZOZOZO"));
        assertEquals(27, shadoks.decode("GABUZOMEU"));
    }

}
