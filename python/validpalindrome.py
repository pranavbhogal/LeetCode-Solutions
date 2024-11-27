def isPalindrome(self, s: str) -> bool:
        s = "".join(e.lower() for e in s if e.isalnum())
        print(s)
        start, end = 0, len(s)-1
        print(start, end)
        while start < end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
        return True