A = int(input())
B = int(input())
C = int(input())

result = A * B * C

res = list(str(result))
lis = [0] * 10

for i in res:
    for j in range(10):
      if i == str(j):
        lis[int(i)] += 1
for i in lis:
  print(i)