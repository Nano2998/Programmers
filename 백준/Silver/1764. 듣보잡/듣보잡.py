import sys
input = sys.stdin.readline

n,m = map(int,input().split())
look = []
hear = []
for _ in range(n):
    look.append(input().strip())

for _ in range(m):
    hear.append(input().strip())

look = set(look)
hear = set(hear)

heok = list(look&hear)

print(len(heok))
heok.sort()
print('\n'.join(heok))