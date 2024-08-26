import sys
input = sys.stdin.readline

n = int(input())
a = {}
lis = []

for _ in range(n):
    peoples = list(map(str,input().split()))
    a[peoples[0]] = peoples[1]


for key, value in a.items():
    if value == 'enter':
        lis.append(key)

lis.sort(reverse=True)

for i in lis:
    print(i)