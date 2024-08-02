A = []

while True:
  A.append(float(input()))

  if A[-1] == 999:
    break

for i in range(len(A)-2):
  print(f"{A[i+1] - A[i]:.2f}")