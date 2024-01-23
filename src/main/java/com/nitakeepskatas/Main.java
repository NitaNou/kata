package com.nitakeepskatas;

public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();

//        int romanTest = kata.romanToInt("MCMXCIV");
//        System.out.println(romanTest);

        boolean test1 = kata.wordPattern("abba", "dog cat cat dog");
        boolean test2 = kata.wordPattern("abba", "dog cat cat fish");
        boolean test3 = kata.wordPattern("aaaa", "dog cat cat dog");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }
}
