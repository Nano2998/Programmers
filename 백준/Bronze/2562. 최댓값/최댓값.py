N = 9
list1 = []
max = 0
for i in range(N):
  list1.append(int(input()))
  if list1[i] > max:
    max = list1[i]


print(max)
print(list1.index(max)+1)