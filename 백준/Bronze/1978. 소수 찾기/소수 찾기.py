n = int(input())
arr = list(map(int, input().split()))
cnt = 0

def ist(k):
  if k == 1:
    return False
  for i in range(2,k):
    if k % i == 0:
      return False
  return True

for i in arr:
  if ist(i) == True:
    cnt += 1

print(cnt)