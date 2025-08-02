class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        arr= []

        if (len(nums)> (10 ** 4)):
            print("Not valid num length")
        elif ((target< (-10 ** 9)) or  (target > (10 ** 9))):
            print("Not a valid target number")
        else:
            for i in range(0,len(nums)-1):
                for j in range(i+1, len(nums)):
                    if (nums[i] + nums[j]== target):
                        arr.append(i)
                        arr.append(j)
                        break
            return arr



        