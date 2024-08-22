import sys
input = sys.stdin.readline

N = int(input())
list = []

for _ in range(N):
    list.append(int(input().rstrip()))

list.sort(key=lambda x:x)
for i in list: 
    print(i)