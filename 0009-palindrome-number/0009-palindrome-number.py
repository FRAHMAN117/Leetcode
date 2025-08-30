class Solution(object):
    def isPalindrome(self, x):
        list= str(x)
        return list == list[::-1]
        