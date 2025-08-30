class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        if (len(nums)<0 or len(nums)> 100) or (val<0 or val>100):
            print ("invalid")
            return -1

        for i in range(len(nums)-1,-1,-1):
            if nums[i]== val:
                nums.pop(i)

        return len(nums)
        