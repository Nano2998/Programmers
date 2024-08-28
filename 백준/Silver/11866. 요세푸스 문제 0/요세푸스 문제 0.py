# 1 2 3 4 5 6 7 / 3삭제
# 1 2 4 5 6 7 / 6삭제
# 1 2 4 5 7 / 2삭제
# 1 4 5 7 / 7삭제
# 1 4 5 / 5삭제
# 1 4 / 1삭제
# 4 / 4삭제

from collections import deque

n, k= map(int,input().split())
li = []
q = deque([i for i in range(1,n+1)])

while len(q) != 0:
    q.rotate(-(k-1))
    li.append(q.popleft())

print("<" + ", ".join(str(j) for j in li ) + ">")