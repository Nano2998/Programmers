a,b,c = map(int,input().split())

if a < b and b < c:
    print(a,b,c)
elif c < b and b < a:
    print(c,b,a)
elif b < a and a < c:
    print(b,a,c)
elif a < c and c < b:
    print(a,c,b)
elif b < c and c < a:
    print(b,c,a)
else:
    print(c,a,b)