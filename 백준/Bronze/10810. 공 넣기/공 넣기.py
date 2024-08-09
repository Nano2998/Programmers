n, m = map(int,input().split())
bas = [0] * n

for _ in range(m):
  a = list(map(int,input().split()))
  for i in range(a[0]-1,a[1]):
      bas[i] = a[2]

print(*bas)