package com.syarifulanam;

public class String1Demo2 {
    public static void main(String[] args) {
//        String extraEnd = "Hello";
//
//        String result = extraEnd.substring(extraEnd.length()-2);
//        System.out.println(result + result + result);
        System.out.println(firstTwo("hello"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("c"));
    }

    public static String firstTwo(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0,2);
        }
    }

}