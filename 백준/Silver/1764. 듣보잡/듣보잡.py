n,m = map(int,input().split())
look = []
hear = []
for _ in range(n):
    look.append(input())

for _ in range(m):
    hear.append(input())

look = set(look)
hear = set(hear)

a = list(look&hear)
a.sort()

print(len(a))
for i in a:
    print(i)