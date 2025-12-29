class Solution(object):
    def countEven(self, num):
        c=0
        for i in range(2,num+1):
            s=sum([int(a) for a in str(i)])
            if s%2==0:
                c+=1
        return c
