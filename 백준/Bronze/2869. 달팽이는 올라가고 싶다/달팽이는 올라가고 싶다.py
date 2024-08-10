a, b, v = map(int, input().split())

diff = a - b

# v-1까지 도달하기 위해서 몇 번을 올라야 하는지를 계산
if (v - a) % diff == 0:
    answer = (v - a) // diff + 1
else:
    answer = (v - a) // diff + 2

print(answer)
