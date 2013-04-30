package com.vdupain.tests;

public class PascalTriangle {

    public Integer pascal(int c, int r) {
        if (c==r || c == 0) return 1;
        else return pascal(c, r - 1) + pascal(c - 1, r - 1);
    }


    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row <= 10; row++) {
            for (int col = 0; col <= row; col++)
                sb.append(pascal(col, row)).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }

}
