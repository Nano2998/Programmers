import sys

input = sys.stdin.readline

n,m = map(int,input().split())
arr = list(map(int,input().split()))
sum = 0
sum_arr = [0]

for i in arr:
    sum += i
    sum_arr.append(sum)

for _ in range(m):
    a,b = map(int,input().split())
    print(sum_arr[b] - sum_arr[a-1])