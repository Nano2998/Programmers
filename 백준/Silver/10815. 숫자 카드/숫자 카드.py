n = int(input())
card = set(map(str,input().split()))

m = int(input())
num_list = list(map(str,input().split()))

answer = []

for i in num_list:
    if i in card:
        answer.append(1)
    else:
        answer.append(0)

print(*answer)