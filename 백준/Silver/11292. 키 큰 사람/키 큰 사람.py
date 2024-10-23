import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if n == 0:
        break
    arr =[]
    for _ in range(n):
        a = input().split()
        a[1] = float(a[1])
        arr.append(a)
        
    arr.sort(key=lambda x:x[1], reverse=True)

    answer = []
    for i in arr:
        if i[1] == arr[0][1]:
            answer.append(i[0])

    print(*answer)