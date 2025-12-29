class Solution(object):
    def convertTime(self, cu, co):
        return ((lambda x : (x[2] - x[0])+ (x[3]-x[1])//15 + ((x[3]-x[1])%15)//5 + ((x[3]-x[1])%15)%5)((lambda a, b, c, d  : [a, b, c-1, d+60] if d < b else [a, b, c, d])(int(cu.split(':')[0]), int(cu.split(':')[1]),int(co.split(':')[0]), int(co.split(':')[1]))))
