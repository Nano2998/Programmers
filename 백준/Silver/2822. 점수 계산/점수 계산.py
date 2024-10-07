dic = {}
arr = []
arr_top = []
idx = []
for i in range(8):
    a = int(input())
    arr.append(a)
    dic[a] = i + 1
    
arr.sort(reverse=True)

for i in range(5):
    arr_top.append(arr[i])

print(sum(arr_top))

for value in arr_top:
    idx.append(dic[value])

idx.sort()
for i in idx:
  print(i,end=" ")