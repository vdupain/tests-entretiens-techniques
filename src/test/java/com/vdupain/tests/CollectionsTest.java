package com.vdupain.tests;

import com.vdupain.tests.solutions.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class CollectionsTest  {
    List<String> list1 = Arrays.asList("Larry", "Moe", "Curly");
    List<String> list2 = Arrays.asList("xxx", "Curly", "bbb");

    private OperationsEnsemblistes op = new Collections();

    @Test
    public void testSort() {
        assertEquals("[Curly, Larry, Moe]", op.sort(list1).toString());
    }

    @Test
    public void testUnion() {
        assertEquals("[Larry, Moe, Curly, xxx, Curly, bbb]", op.union(list1, list2).toString());
    }

    @Test
    public void testIntersection() {
        assertEquals("[Curly]", op.intersection(list1, list2).toString());
    }

    @Test
    public void testDifference() {
        assertEquals("[Larry, Moe, xxx, bbb]", op.difference(list1, list2).toString());
    }

}
