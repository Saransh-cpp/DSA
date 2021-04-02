package com.company.strings.stringBuilder;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
