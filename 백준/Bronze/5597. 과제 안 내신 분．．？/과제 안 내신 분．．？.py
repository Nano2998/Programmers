stu = []
answer = []
arr = []
for i in range(1,31):
  answer.append(i)

for _ in range(1,29):
  stu.append(int(input()))

for i in answer:
  if i not in stu :
    arr.append(i)

for j in arr:
  print(j)