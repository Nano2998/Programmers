a, b = map(int,input().split())
A = []
B = []
C = []
D = []

max = 0
min = 0

for i in range(1,a+1): 
    C.append(i * b)

for i in range(1,b+1): 
    D.append(i * a)

for i in C:
  if i in D:
    max = i
    break

for i in range(1,a+1):
  if a % i == 0:
    A.append(i)

for i in range(1,b+1):
  if b % i == 0:
    B.append(i)

A.sort(reverse = True)
for i in A:
  if i in B:
    min = i
    break

print(min)
print(max)