A = int(input())
B = []

for a in range(A):
  B.append(input())

for b in B:
  i = 0
  score = 0
  answer = 0
  while i <= len(b)-1:
    if b[i] == 'O':
      i += 1
      score += 1
    else:
      i += 1
      score = 0
    answer += score
  print(answer)