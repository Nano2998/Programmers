n, q = map(int,input().split())
arr = [0] * (n+1)

for _ in range(q):
  a,b = map(int,input().split())
  for i in range(a,len(arr),b):
    arr[i] = 1
    
print(arr.count(0) - 1)