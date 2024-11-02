import sys
from collections import deque

input = sys.stdin.readline

def bfs(visited, start, graph):
    dq = deque([start])
    visited[start] = 1
    cnt = 2 
    while dq:
        a = dq.popleft()
        for i in sorted(graph[a]): 
            if not visited[i]:
                dq.append(i)
                visited[i] = cnt
                cnt += 1

n, m, r = map(int, input().split())
graph = [[] for _ in range(n+1)] 
visited = [0] * (n+1)  

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(visited, r, graph)

for i in range(1, n+1):
    print(visited[i])