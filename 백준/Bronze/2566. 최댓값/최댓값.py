arr = [list(map(int,input().split())) for _ in range(9)]

max = -1
a = -1
b = -1

for i in range(9):
    for j in range(9):
        if max < arr[i][j]:
            max = arr[i][j]
            a = i+1
            b = j+1

print(max)
print(a,b)