T = int(input())
words = []
for t in range(T):
  cnt, word = input().split()

  for w in word:
    print(int(cnt) * w, end='')
  print()