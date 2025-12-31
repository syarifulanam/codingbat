package com.syarifulanam;

public class String1 {
    public static void main(String[] args) {
//        System.out.println(helloName("anam"));

//        System.out.println(makeAbba("Hai", "Bye"));

//        System.out.println(makeTags("i", "yay"));

//        System.out.println(makeOutWord("<<>>", "yay"));

//        System.out.println(firstTwo("hello"));
//        System.out.println(firstTwo(""));
//        System.out.println(firstTwo("c"));

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
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

    public static String helloName(String name) {
        return "Hai " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}