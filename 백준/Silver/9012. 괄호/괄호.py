t = int(input())

for _ in range(t):
  a = input()
  count = 0
  balanced = True
  
  for st in a:
    if st == '(':
      count += 1
    elif st == ')':
      count -= 1

    if count < 0:
      balanced = False
      break;

  if count == 0 and balanced:
    print("YES")
  else:
    print("NO")