n = int(input())
arr = list(map(int,input().split()))
answer = []
for i in arr:
    if i not in answer:
        answer.append(i)
answer.sort()
for i in answer:
    print(i,end=" ")