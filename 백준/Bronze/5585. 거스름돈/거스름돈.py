coins = [ 500, 100, 50, 10, 5, 1 ]
a = int(input())
cnt = 0
money = 1000 - a
for coin in coins:
    cnt += money // coin
    money %= coin
print(cnt)