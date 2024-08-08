n, m = map(int,input().split())

bas = []

for i in range(1,n+1):
  bas.append(i)

for i in range(m):
    a, b = map(int, input().split())
    # a, b가 1부터 시작하므로 0 기반 인덱스로 변환
    bas[a-1:b] = bas[a-1:b][::-1]

print(*bas)