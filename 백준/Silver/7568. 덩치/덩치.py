N = int(input())
A = []
B = []
for n in range(N):
  A.append(list(map(int,input().split())))

for i in range(N):
  rank = 1
  for j in range(N):
    if A[i][0] < A[j][0] and A[i][1] < A[j][1]:
      rank += 1
  B.append(rank)

print(*B)