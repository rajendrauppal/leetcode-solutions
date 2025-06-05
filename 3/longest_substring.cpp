class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if (s.empty()) return 0;
        
        int maxLength = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int stringLength = s.length();
        unordered_map<char, int> charCount;
        
        while (windowEnd < stringLength) {
            // If character already exists in current window
            if (charCount[s[windowEnd]] > 0) {
                // Remove characters from the left until duplicate is removed
                charCount[s[windowStart]]--;
                windowStart++;
            } else {
                // Add new character to window
                charCount[s[windowEnd]]++;
                windowEnd++;
                // Update max length
                maxLength = max(maxLength, windowEnd - windowStart);
            }
        }
        
        return maxLength;
    }
};
