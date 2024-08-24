n,k = map(int,input().split())

coin = []
cnt = 0

for _ in range(n):
    coin.append(int(input()))

coin.sort(reverse=True)

for ea_coin in coin:
    cnt += k // ea_coin
    k = k % ea_coin

print(cnt)