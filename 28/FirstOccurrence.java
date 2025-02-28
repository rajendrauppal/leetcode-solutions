/*
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

 class Solution {
    public int strStr(String haystack, String needle) {
        // empty needle can be found at index 0.
        if (needle.isEmpty()) return 0;
        // if needle is longer than haystack, then it can not be found.
        if (needle.length() > haystack.length()) return -1;
        // run a sliding window of length of needle over haystack
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length())
                return i;
        }
        return -1;
    }
}
