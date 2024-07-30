result = list(map(int, input().split(' ')))
b = 0
for a in result:
    b += a**2
answer = b % 10
print(answer)