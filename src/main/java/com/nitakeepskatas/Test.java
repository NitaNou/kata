package com.nitakeepskatas;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Kata kata = new Kata();

//        int romanTest = kata.romanToInt("MCMXCIV");
//        System.out.println(romanTest);

//        boolean test1 = kata.wordPattern("abba", "dog cat cat dog");
//        boolean test2 = kata.wordPattern("abba", "dog cat cat fish");
//        boolean test3 = kata.wordPattern("aaaa", "dog cat cat dog");
//        System.out.println(test1);
//        System.out.println(test2);
//        System.out.println(test3);

//        String s = "rat";
//        int[] count = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i) - 'a']++;
//        }
//        System.out.println(Arrays.toString(count));

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(array));


        /*              //Testing method main4:
        Scanner scanner = new Scanner(System.in);
        int firstNumIteration = scanner.nextInt();
        ArrayList<ArrayList<Integer>> verticalList = new ArrayList<>();
        for (int i = 0; i < firstNumIteration; i++) {
            int nextIteration = scanner.nextInt();
            ArrayList<Integer> horizontalList = new ArrayList<>();
            for (int j = 0; j < nextIteration; j++) {
                int numInIteration = scanner.nextInt();
                horizontalList.add(numInIteration);
            }
            verticalList.add(horizontalList);
        }
        int numOfQuery = scanner.nextInt();
        for (int i = 0; i < numOfQuery; i++) {
            int xLine = scanner.nextInt(); //3
            int yPosition = scanner.nextInt(); //4
            if (xLine > verticalList.size() || yPosition > verticalList.get(xLine-1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(verticalList.get(xLine-1).get(yPosition-1));
            }
        }
        */


    }
}
