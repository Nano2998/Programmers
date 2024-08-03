A = int(input())
B = list(map(int,input().split()))
C = 0
for a in range(A):
 C += B[a] / max(B) * 100
D = C / A 

print(D)