N = int(input())

arr = []
for i in range(1,N+1):
    arr.append(i)

card = []

while True:
    if len(arr) == 1:
        c = arr.pop()
        card.append(c)
        break
    a = arr.pop(0)
    card.append(a)
    b = arr.pop(0)
    arr.append(b)

print(*card)