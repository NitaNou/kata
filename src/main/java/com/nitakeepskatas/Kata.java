package com.nitakeepskatas;

import java.util.*;

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

    /*  (9)                                     12-26-23
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) == lastWord.charAt(i)) {
                result.append(firstWord.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

    /*  (10)                                    01-02-24
        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
        and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
        and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (j >= 0) {
            if (i >= 0 && (nums1[i] > nums2[j])) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }

        }
    }

    /*  (11)                                    01-04-24
        Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.
        Example 1:
            Input: ransomNote = "a", magazine = "b"
            Output: false
        Example 2:
            Input: ransomNote = "aa", magazine = "ab"
            Output: false
        Example 3:
            Input: ransomNote = "aa", magazine = "aab"
            Output: true
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> newMap = new HashMap<Character, Integer>();

        for (int i = 0; i < magazine.length(); i++) {
            newMap.put(magazine.charAt(i), newMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!newMap.containsKey(ransomNote.charAt(i)) || newMap.get(ransomNote.charAt(i)) <= 0) {
                return false;
            }
            newMap.put(ransomNote.charAt(i), newMap.get(ransomNote.charAt(i)) - 1);
        }

        return true;
    }

    /*  (12)                                    01-10-24
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Example 1:
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>(); // holds: complementValue if not the indexValue, index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // complement = 9 - 2 --> 7
            if (complementMap.containsKey(complement)) {
                return new int[]{i, complementMap.get(complement)};
            } else {
                complementMap.put(nums[i], i);
            }
        }
        return null;
    }

    /*  (13)                                    01-11-24
        Given two strings s and t, determine if they are isomorphic.
        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
        All occurrences of a character must be replaced with another character while preserving
        the order of characters. No two characters may map to the same character, but a character may map to itself.
        Example 1:
            Input: s = "egg", t = "add"
            Output: true
        Example 2:
            Input: s = "foo", t = "bar"
            Output: false
     */
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> newMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            Character letterInSString = s.charAt(i);
            Character letterInTString = t.charAt(i);
            if (!newMap.containsKey(letterInSString)) {
                if (!newMap.containsValue(letterInTString)) {
                    newMap.put(letterInSString, letterInTString);
                } else {
                    return false;
                }
            } else {
                Character duplicateSString = newMap.get(letterInSString);
                if (duplicateSString != letterInTString) {
                    return false;
                }
            }
        }
        return true;
    }

}
