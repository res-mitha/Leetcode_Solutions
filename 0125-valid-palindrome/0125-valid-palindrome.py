class Solution:
    def isPalindrome(self, s: str) -> bool:
        a="".join(char for char in s.lower() if char.isalnum())
        return a==a[::-1]
        