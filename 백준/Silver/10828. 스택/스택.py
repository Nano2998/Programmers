n = int(input())

arr = []

for _ in range(n):
    cmd = input().split()
    if cmd[0] == 'push':
        arr.append(int(cmd[1]))
    elif cmd[0] == 'top':
        if len(arr) == 0:
            print(-1)
        else:
            print(arr[-1])
    elif cmd[0] == 'size':
        print(len(arr))
    elif cmd[0] == 'empty':
        if len(arr) == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == 'pop':
        if len(arr) == 0:
            print(-1)
        else:
            b = arr.pop()
            print(b)