package com.syarifulanam;

public class Test {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeTags("i", "yay"));
        System.out.println(makeOutWord("<<>>", "yay"));
        System.out.println(withoutEnd("hello"));
        System.out.println(comboString("hello", "hi"));
        System.out.println(nonStart("hello", "there"));
        System.out.println(left2("Hello"));

    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + a + b;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
