# 숫자 두개를 합쳐서 m이 되면 완성
import sys
input = sys.stdin.readline

n = int(input()) # 숫자의 개수
m = int(input()) # 숫자 2개로 만들어야 할 값
lst = list(map(int,input().split())) # 숫자들 목록

lst.sort()
start, end = 0, len(lst)-1 # 가장 작은지점 시작 , 가장 큰 수
total = 0

while start < end:
    sum = lst[start] + lst[end]
    if sum > m: # 합이 m보다 크면 end가 너무큼
        end -= 1
    elif sum < m: # 합이 m보다 작으면 start가 너무 작음
        start += 1
    else: # 둘다 아니라면 두수의 합은 m이라는거임
        total+=1 # 카운트 1개 더해주고, 중복이 되면 안되니까
        start += 1 # start 한칸 밀고
        end -= 1 # end 한칸 당김

print(total)