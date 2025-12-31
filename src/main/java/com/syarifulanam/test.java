package com.syarifulanam;

public class test {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeTags("i", "yay"));
        System.out.println(makeOutWord("<<>>", "yay"));

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
        return out.substring(0,2) + word + out.substring(2);
    }

}
