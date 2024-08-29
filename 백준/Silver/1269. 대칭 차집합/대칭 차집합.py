a,b = map(int,input().split())
A_list = set(list(map(int,input().split())))
B_list = set(list(map(int,input().split())))
cnt = 0

cnt += len(A_list ^ B_list)

print(cnt)