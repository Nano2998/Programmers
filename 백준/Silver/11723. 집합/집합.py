import sys
input = sys.stdin.readline

s = int(input())
lst = set()

for _ in range(s):
    a = list(input().rstrip().split())
    if len(a) == 2:
        a[1] = int(a[1])

    if a[0] == "add":
        lst.add(a[1])
    elif a[0] == "remove":
        lst.discard(a[1])
    elif a[0] == "check":
        if a[1] in lst:
            print(1)
        else:
            print(0)
    elif a[0] == "toggle":
        if a[1] in lst:
            lst.discard(a[1])
        else:
            lst.add(a[1])
    elif a[0] == "all":
        lst = set(range(1,21))
    elif a[0] == "empty":
        lst.clear()