# test case의 수 T
T = int(input())
# a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 살아야함
# K층 n호에 살 고 있는 사람 수 => (k-1)층의 1호 + n호의 수 합만큼 살아야함
# 0층의 1호에는 1명이 살고, 2호에는 2명이 삼
# 1층의 3호에 살려면.. 1~3호 만큼의 합만큼 데려와 살아야함 = 1,2,3 = 6명
# 2층의 3호에 사려면.. 1층의 1~3호 만큼의 합 , 1,3,6
arr = [[0] * 14 for _ in range(14)]

floor_0 = list(range(1,15))
arr.insert(0,floor_0)

for i in range(1,15): 
  for j in range(0,14):
    arr[i][j] = sum(arr[i-1][:j+1]) 

for t in range(T):
  K = int(input())
  N = int(input())
  print(arr[K][N-1])