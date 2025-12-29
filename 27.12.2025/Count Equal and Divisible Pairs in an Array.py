class Solution(object):
    def countPairs(self, nums, k):
        out = 0
        for i in range(0,len(nums)) :
            for j in range(i+1,len(nums)) :
                if(nums[i] == nums[j] and (i * j) % k == 0) :
                    out+=1
        return out
        
