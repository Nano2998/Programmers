from collections import deque

#테스트 케이스 입력
n = int(input())

for _ in range(n):
    dq = deque()
    # 카운트 세기
    cnt = 0

    # lis를 deque 형태로 진행
    a,b = map(int,input().split())
    
    #중요도 삽입 / 인덱스 지정
    arr = list(map(int,input().split()))
    for idx, value in enumerate(arr):
        dq.append((idx,value))

    while dq:
        # 젤 왼쪽 숫자를 빼고
        i = dq.popleft()

        # max보다 작다면 다시 뒤로 집어넣기
        flag = 0

        for doc in dq:
            if i[1] < doc[1]:
                dq.append(i)
                flag = 1
                break
            
        if flag == 0:
            cnt += 1
            if i[0] == b:
                print(cnt)
                break