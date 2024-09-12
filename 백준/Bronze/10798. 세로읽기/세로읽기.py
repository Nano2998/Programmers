arr = [['-' for _ in range(15)] for _ in range(5)]

for i in range(5):
    a = input().rstrip()
    for j, char in enumerate(a):
        arr[i][j] = char

result =''
for j in range(15):
    for i in range(5):
        if arr[i][j] != '-':
            result += arr[i][j]

print(result)