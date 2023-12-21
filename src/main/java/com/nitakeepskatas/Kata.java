package com.nitakeepskatas;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    /*                                  12-20-23
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

    /*                                  12-20-23
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

    /*                                  12-21-23
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


}
