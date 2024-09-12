arr = []
word = []
length = 0
cnt = 0


for _ in range(5):
    a = input()
    arr.append(a)
    if length < len(a):
        length = len(a)

while True:
    if length == cnt:
        break

    for i in arr:
        try:
            word.append(i[cnt])
        except:
            pass
    cnt += 1

print("".join(word))