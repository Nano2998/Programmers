k = int(input())

cnt = []

for i in range(k):
    a = int(input())
    if a == 0:
        cnt.pop()
    else:
        cnt.append(a)

print(sum(cnt))