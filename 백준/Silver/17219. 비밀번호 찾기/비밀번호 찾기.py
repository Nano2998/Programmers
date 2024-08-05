N , M = map(int,input().split())

A = []
B = []
answer = []
dic = {}
i = 0

for a in range(N):
  n, m = input().split()
  dic[str(n)] = m

for a in range(M):
  B.append(input())

for i in B:
  print(dic[i])