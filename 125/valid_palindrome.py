class Solution:
    def isPalindrome1(self, s: str) -> bool:
        r = []
        for c in s:
            if c.isalpha() or c.isnumeric():
                r.append(c)
        r = ''.join(r)
        r = r.lower()
        return r == r[::-1]

    def isPalindrome(self, s: str) -> bool:
        start = 0
        end = len(s) - 1
        while start < end:
            while start < end and not s[start].isalnum():
                start += 1
            while start < end and not s[end].isalnum():
                end -= 1
            if s[start].lower() != s[end].lower():
                return False
            start += 1
            end -= 1
        return True