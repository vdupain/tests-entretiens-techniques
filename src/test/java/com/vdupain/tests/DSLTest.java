package com.vdupain.tests;


import com.vdupain.tests.dsl.Expression;
import static com.vdupain.tests.solutions.DSL.XXX.start;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DSLTest {

    @Test
    public void test1() {
        Expression okExpression = new Expression() {
            public void eval() {
                assertTrue(true);
            }
        };
        Expression failExpression = new Expression() {
            public void eval() {
                fail();
            }
        };
        start().If(true).Then(okExpression).Else(failExpression);
        start().If(false).Then(failExpression).Else(okExpression);
        
    }


}
