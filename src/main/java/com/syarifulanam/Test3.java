package com.syarifulanam;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(lastTwo("Hello"));
        System.out.println(lastTwo("Hi"));
        System.out.println(lastTwo(""));
        System.out.println(lastTwo("A"));
        System.out.println(lastTwo("Syariful"));
    }

    public static String lastTwo(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.length() < 3) {
            return str;
        }

        return str.substring(str.length() - 2);
    }
}
