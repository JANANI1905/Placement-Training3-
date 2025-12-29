class Solution(object):
    def countPoints(self, rings):
        hashmap={}
        for i in range(len(rings)):
            if rings[i].isdigit():
                if rings[i] not in hashmap:
                    hashmap[rings[i]]=rings[i-1]
                else:
                    hashmap[rings[i]]+=rings[i-1]
        c=0
        for k in hashmap:
            if hashmap[k].count("B") and hashmap[k].count("G") and hashmap[k].count("R"):
                c+=1
        return c
        
