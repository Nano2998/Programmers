A = list(map(int,input().split()))
B = [1,2,3,4,5,6,7,8]
C = sorted(B, reverse=True)

if A == B:
  print('ascending')
elif A == C:
  print('descending')
else:
  print('mixed')