n = int(input())
n_arr = map(int,input().split())
m = int(input())
m_arr = map(int,input().split())
ans_arr = []

dic = {}
for i in n_arr:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

for i in m_arr:
    if i in dic:
        ans_arr.append(str(dic[i]))
    else:
        ans_arr.append('0')

print(' '.join(ans_arr))