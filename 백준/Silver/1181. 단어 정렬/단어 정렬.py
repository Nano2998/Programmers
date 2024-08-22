import sys
input = sys.stdin.readline

N = int(input())
wrd = set() ## set으로 중복 제거

for _ in range(N):
    wrd.add(input().rstrip()) ## 글자 입력

wrd = list(wrd) ## list형으로 변환

wrd.sort(key = lambda x: (len(x),x)) # sort 로 길이순, 알파벳순 정렬

for i in wrd:
    print(i)