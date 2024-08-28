#3 2 1 -3 -1 / 3
#-3 -1 2 1 / -3
#-1 2 1 / -1
# 1 2 / 1
# 2 / 2

from collections import deque 
q = deque

n = int(input())
arr = []
ballons = q(enumerate(map(int,input().split()),start=1))

for i in range(n):
    idx, a = ballons.popleft()
    arr.append(str(idx))
    if a > 0:
        ballons.rotate(-(a-1))
    else:
        ballons.rotate(-a)
print(" ".join(arr))