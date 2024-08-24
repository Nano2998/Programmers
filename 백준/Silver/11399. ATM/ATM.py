N = int(input()) ## 인원 수

time = list(map(int,input().split())) ## 시간

total = 0
mins = []

time = sorted(time, key=lambda x:x)

for t in time:
    total += t
    mins.append(total)

print(sum(mins))
# ex) 3 1 4 3 2
# a : 2 5 1 4 3