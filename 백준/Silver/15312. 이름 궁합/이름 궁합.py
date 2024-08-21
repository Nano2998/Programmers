cnt = [ 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]

A = input() ## '그'의 이름
B = input() ## '그녀'의 이름

## cnt[ord(A[0])-65] 자리별 구하는 공식
arr = []
j = 1
for i in range(len(A)-1): ## 숫자 변환
    arr.append(cnt[ord(A[i])-65] + cnt[ord(B[i])-65]) ## 0 0
    arr.append(cnt[ord(A[j])-65] + cnt[ord(B[i])-65]) ## 1 0
    j += 1
    if j == len(A):
        arr.append(cnt[ord(A[j-1])-65] + cnt[ord(B[j-1])-65])

## 이제 숫자 더하기
for i in range(len(arr)-1, 1, -1): ## 5부터 1이될때까지 -1씩 계속 배열 줄이기
    for j in range(i):
        arr[j] = arr[j] + arr[j+1]

print(str(arr[0])[-1] + str(arr[1])[-1])

# 4  5 5 5 4
#  9 10 10 9
#  19  20 19 
#    9   9
#     99
