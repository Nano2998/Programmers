import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int,input().split()))
arr2 = 0
ans = 0
for i in range(n):
    if arr[i] == 1:
        ans += 1
        arr2 += ans
    else:
        ans = 0
print(arr2)