package com.nitakeepskatas;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    /* (1)                                 12-20-23
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
        removing all non-alphanumeric characters,
        it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.
    */
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String alphaNum = lowerCase.replaceAll("[^a-z0-9]", "");
        boolean result = true;
        for (int i = 0; i < alphaNum.length(); i++) {
            char leftChar = alphaNum.charAt(i);
            char rightChar = alphaNum.charAt(alphaNum.length() - 1 - i);
            if (leftChar != rightChar) {
                result = false;
            }
        }
        return result;
    }

    /*  (2)                                12-20-23
        Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
        of the characters without disturbing the relative positions of the remaining characters.
        (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
    public boolean isSubsequence(String s, String t) {
        boolean result = false;

        int sCounter = 0;
        int tCounter = 0;

        while (sCounter < s.length() && tCounter < t.length()) {
            if (s.charAt(sCounter) == t.charAt(tCounter)) {
                sCounter++;
                tCounter++;
            } else {
                tCounter++;
            }
        }

        if (sCounter == s.length()) {
            result = true;
        }

        return result;
    }

    /*  (3)                                12-21-23
        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
        The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
        Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
        The remaining elements of nums are not important as well as the size of nums.
        Return k.
     */
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    /*  (4)                                12-23-23
        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
        The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
        Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
        Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
        The remaining elements of nums are not important as well as the size of nums.
        Return k.
     */
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i < nums.length - 1) && (nums[i] == nums[i + 1])) {
            } else {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    /*  (5)                                12-23-23
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.
        Input: nums = [2,2,1,1,1,2,2]
                      [3,2,3]
        Output: 2
     */
    public int majorityElement(int[] nums) {
        int majority = 0;
        int points = 0;
        for (int i = 0; i < nums.length; i++) {
            if (points == 0) {
                majority = nums[i];
            }
            if (majority == nums[i]) {
                points++;
            } else {
                points--;
            }
        }
        return majority;
    }

    /* (6)                                  12-24-23
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and
        choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction.
        If you cannot achieve any profit, return 0.
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

    /* (7)                                  12-24-23
        Given a string s consisting of words and spaces, return the length of the last word in the string.
        A word is a maximal substring consisting of non-space characters only.
        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.
     */
    public int lengthOfLastWord(String s) {
        String trimmedWord = s.trim();
        int length = 0;
        for (int i = trimmedWord.length() - 1; i >= 0; i--) {
            if (trimmedWord.charAt(i) != ' ') {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    /*  (8)                                     12-26-23
        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
        or -1 if needle is not part of haystack.
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
     */
    public int strStr(String haystack, String needle) {

        int firstOccurence = haystack.contains(needle) ? haystack.indexOf(needle) : -1;
        return firstOccurence;

//        if (haystack.contains(needle)) {
//            firstOccurence = haystack.indexOf(needle);
//        } else {
//            firstOccurence = -1;
//        }
//        return firstOccurence;
    }

}
