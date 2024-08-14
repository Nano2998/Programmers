n, m = map(int,input().split())
card = list(map(int,input().split()))
card.sort()

arr = []
sum = 0

for i in range(n-2): ## 0 1 2 3 
  for j in range(i+1,n-1): ## 1 2 3 4  
    for k in range(j+1,n): ## 2 3 4 5 
      sum = card[i] + card[j] + card[k]
      if sum <= m:
        arr.append(sum)

print(max(arr))