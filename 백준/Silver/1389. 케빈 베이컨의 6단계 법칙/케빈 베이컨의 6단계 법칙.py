from collections import deque

def bfs(graph,visited,start):
    dq =deque([start])
    sum = 0
    visited[start] = True
    dic = {start: 0}
    while dq:
        a = dq.popleft()
        for i in graph[a]:
            if i not in dic:
                dic[i] = dic[a] + 1
            if not visited[i]:
                dq.append(i)
                visited[i] = True
    for i,j in dic.items():
        sum += j
    arr.append(sum)

n,m = map(int,input().split())

graph = [[] for _ in range(n+1)]
arr = []

for _ in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1,n+1):
    visited = [False] * (n+1)
    bfs(graph,visited,i)

min = max(arr)
answer = 1
for i in range(len(arr)):
    if min > arr[i]:
        min = arr[i]
        answer = i+1

print(answer)