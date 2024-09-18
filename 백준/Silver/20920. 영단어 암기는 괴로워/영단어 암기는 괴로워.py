import sys
input = sys.stdin.readline

n,m = map(int,input().rstrip().split())

dic = {}
for _ in range(n):
    word = input().rstrip()
    if len(word) >= m:
        if word in dic:
            dic[word] += 1
        else:
            dic[word] = 0

arr = []
for i, j in dic.items():
    arr.append([i,j,len(i)])

arr.sort(key=lambda x:(-x[1],-x[2],x[0]))

for key in arr:
    print(key[0])