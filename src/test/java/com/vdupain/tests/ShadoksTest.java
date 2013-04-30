package com.vdupain.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ShadoksTest {

    @Test
    public void testEncode() {
        assertEquals("GA", ShadoksHelper.encode(0));
        assertEquals("BU", ShadoksHelper.encode(1));
        assertEquals("ZO", ShadoksHelper.encode(2));
        assertEquals("MEU", ShadoksHelper.encode(3));
        assertEquals("ZOZOZO", ShadoksHelper.encode(42));
        assertEquals("BUZOBUGA", ShadoksHelper.encode(100));
    }

    @Test
    public void testDecode() {
        assertEquals(42, ShadoksHelper.decode("ZOZOZO"));
        assertEquals(27, ShadoksHelper.decode("GABUZOMEU"));
    }

}
