package com.syarifulanam;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }

    public static String firstTwo(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }
}
