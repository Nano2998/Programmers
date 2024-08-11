n,m = map(int,input().split())
bas = []

for i in range(1,n+1):
  bas.append(i)

for _ in range(m):
  j,k = map(int,input().split())
  bas[j-1],bas[k-1] = bas[k-1],bas[j-1]

print(*bas)