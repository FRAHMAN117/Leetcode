class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        y=0
        z=0
        negative= False

        if (x< 0):
            x *= -1
            negative= True

        while (x !=0):
            z= x % 10
            x= x//10
            y= (y *10) + z
        if (negative==True):
            y *=-1

        if (y< (-2 ** 31) or y> ((2 ** 31)-1)):
            return 0
        else:
            return y

        