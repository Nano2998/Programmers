chess = [1, 1, 2, 2, 2, 8]

arr = list(map(int, input().split()))
answer = []

for i in range(len(chess)):
    answer.append(chess[i] - arr[i])

print(*answer)