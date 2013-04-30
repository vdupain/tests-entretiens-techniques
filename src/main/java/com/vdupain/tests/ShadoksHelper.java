package com.vdupain.tests;

public class ShadoksHelper {

    //to be implemented
    public static String encode(int i) {
        String converted = Integer.toString(i, 4);
        return converted.replaceAll("0", "GA").replaceAll("1", "BU").replaceAll("2", "ZO").replaceAll("3", "MEU");
    }

    //to be implemented
    public static int decode(String shadok) {
        String base4 = shadok.replaceAll("GA", "0").replaceAll("BU", "1").replaceAll("ZO", "2").replaceAll("MEU", "3");
        return Integer.valueOf(base4, 4);
    }

}
