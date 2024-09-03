a,b = input().split()

a = list(a)
a.reverse()

b = list(b)
b.reverse()
ar = "".join(i for i in a)
br = "".join(i for i in b)

if int(ar) > int(br):
    print(ar)
else:
    print(br)