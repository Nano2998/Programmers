A = 10
B = []
for a in range(A):
  B.append(int(input()) % 42)
B = set(B)
print(len(B))