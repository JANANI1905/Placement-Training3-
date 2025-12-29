class Solution(object):
    def minimumSum(self, num):
        x=sorted(str(num))
        a=int(x[0]+x[2])
        b=int(x[1]+x[3])
        return a+b
            
