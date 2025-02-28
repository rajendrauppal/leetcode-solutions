/*
 * https://leetcode.com/problems/add-binary/
 * Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */

 class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        // start 2 pointers from the end of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        // process while we have characters in either string or a carry
        while (i >= 0 || j >= 0 || carry > 0) {
            // get both digits
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = digitA + digitB + carry;
            // add current bit to the result string
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
