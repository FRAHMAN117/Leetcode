class Solution(object):
    def isPalindrome(self, x):
        list= str(x)
        if list == list[::-1]:
            return True
        else:
            return False
        