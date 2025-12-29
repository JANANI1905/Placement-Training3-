class Solution(object):
    def minimumCost(self, cost):
        cost.sort()
        res = 0
        for i in range(len(cost)):
            if i % 3 != len(cost) % 3:
                res += cost[i]
        return res
