package com.vdupain.tests.solutions;

import com.vdupain.tests.dsl.Expression;

public interface DSL {
    DSL If(boolean condition);

    DSL Then(Expression expr);

    DSL Else(Expression expr);

    public class XXX {
        public static DSL start() {
            return new DSL() {
                private boolean condition;

                @Override
                public DSL If(boolean condition) {
                    this.condition = condition;
                    return this;
                }

                @Override
                public DSL Then(Expression expr) {
                    if (condition) expr.eval();
                    return this;
                }

                @Override
                public DSL Else(Expression expr) {
                    if (!condition) expr.eval();
                    return this;
                }
            };
        }
    }

}