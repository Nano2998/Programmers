while True:
  A = input()
  if A == '0':
    break

  if A == A[::-1]:
    print('yes')
  else:
    print('no')