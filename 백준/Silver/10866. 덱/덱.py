import sys
from collections import deque

input = sys.stdin.readline

dq = deque()
n = int(input())

for _ in range(n):
    a = list(map(str,input().split()))
    if a[0] == 'push_front':
        dq.appendleft(int(a[1]))
    elif a[0] == 'push_back':
        dq.append(int(a[1]))
    elif a[0] == 'pop_front':
        if not dq:
            print(-1)
        else:
            print(dq.popleft())
    elif a[0] == 'pop_back':
        if not dq:
            print(-1)
        else:
            print(dq.pop())
    elif a[0] == 'size':
        print(len(dq))
    elif a[0] == 'empty':
        if not dq:
            print(1)
        else:
            print(0)
    elif a[0] == 'front':
        if not dq:
            print(-1)
        else:
            print(dq[0])
    elif a[0] == 'back':
        if not dq:
            print(-1)
        else:
            print(dq[-1])