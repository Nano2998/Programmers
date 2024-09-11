# T개의 테스트 케이스
T = int(input())

# for _ in range(T):
#     H, W, N = map(int,input().split())
#     hotel = [[0 for col in range(W)] for row in range(H)]

#     for i in range(H):
#         for j in range(W):
#             if j < 9:
#                 hotel[i][j] = str(i+1) + "0" + str(j+1)
#             else:
#                 hotel[i][j] = str(i+1) + str(j+1)

#     for i in hotel:
#         print(i)

for _ in range(T):
    H, W, N = map(int,input().split())
    for n in range(N):
        if n == 0:
            H_index = 1
            W_index = 1
        elif H > H_index:
            H_index += 1
        else:
            H_index = 1
            if W > W_index:
                W_index += 1

    if W_index <= 9:
        print(str(H_index) + "0" + str(W_index))
    else:
        print(str(H_index) + str(W_index))