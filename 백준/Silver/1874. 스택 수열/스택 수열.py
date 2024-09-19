# 스택에 push는 무조건 오름차순
import sys
input = sys.stdin.readline

n = int(input().rstrip())
numbers = [int(input()) for _ in range(n)]
# [4, 3, 6, 8, 7, 5, 2, 1]
arr = []
answer = []
idx = 0
for i in range(1,n+1):
    arr.append(i)
    answer.append('+')
    while True:
        if idx == n:
            for i in answer:
                print(i)
            break
        
        if len(arr) == 0:
            break

        if arr[-1] != numbers[idx]:
            break

        else:
            arr.pop()
            idx += 1
            answer.append('-')
if len(arr) != 0:
    print("NO")