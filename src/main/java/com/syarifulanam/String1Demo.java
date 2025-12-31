package com.syarifulanam;

public class String1Demo {
    public static void main(String[] args) {
        String1Demo string1Demo = new String1Demo();
        System.out.println(string1Demo.helloName("anam"));

//        System.out.println(String1.helloName("firman"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}