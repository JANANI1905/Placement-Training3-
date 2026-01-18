class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        t = list(s)
        for i in range(0, len(t), k << 1): # protected from out-of-index error
            t[i : i + k] = reversed(t[i : i + k])
        return ''.join(t)

class Solution(object):
  def reverseStr(self, s, k):
    """
    :type s: str
    :type k: int
    :rtype: str
    """
    cnt = 0
    isFirst = True
    a = ""
    b = ""
    ans = []
    for c in s:
      if isFirst:
        a = c + a
      else:
        b += c
      cnt += 1
      if cnt == k:
        if isFirst:
          ans.append(a)
          a = ""
        else:
          ans.append(b)
          b = ""
        isFirst = not isFirst
        cnt = 0
    return "".join(ans) + a + b
