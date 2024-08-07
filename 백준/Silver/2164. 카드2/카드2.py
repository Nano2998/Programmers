from collections import deque

N = int(input())

q = deque()

for a in range(N):
  q.append(a+1)

while True:
  if len(q) == 1:
    break
  q.popleft()
  q.append(q.popleft())

result = q.pop()
print(result)