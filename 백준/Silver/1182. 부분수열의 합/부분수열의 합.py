#부분 수열을 통해 S값이 만들어지는 경우의 수 
from itertools import combinations

N, S = map(int,input().split())
arr = list(map(int,input().split()))
lis = []
cnt = 0


for i in range(1, N + 1):
    a = list(combinations(arr, i))
    for j in a:
        if sum(j) == S:
            cnt += 1

print(cnt)