n = int(input())

cow = []

for _ in range(n):
  cow.append(list(map(int,input().split())))

cow.sort()

time = 0

for i in range(n):
  a , b = cow[i]
  if a > time:
    time = a
  time += b

print(time)