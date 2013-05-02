package com.vdupain.tests;



public class PascalTriangle {

    private int rows;

    public PascalTriangle(int rows) {
        this.rows = rows;
    }

    //to be implemented
    public int pascal(int c, int r) {
        if (c==r || c == 0) return 1;
        else return pascal(c, r - 1) + pascal(c - 1, r - 1);
    }


    //to be implemented
    public String print(Function f) {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= row; col++)
                sb.append(f.apply(pascal(col,te	w))).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }

    public String prettyPrint() {
       return print(new Identity());
    }

    public String shadoksPrint() {
        return print(new ShadoksConverter());
    }


    interface Function<T, R> {
        R apply(T arg);
    }

    private class Identity<T> implements Function<T, T> {
        public T apply(T arg) {
            return arg;
        }
    }

    private class ShadoksConverter implements Function<Integer, String> {

        public String apply(Integer arg) {
            return ShadoksHelper.encode(arg);
        }
    }
}
