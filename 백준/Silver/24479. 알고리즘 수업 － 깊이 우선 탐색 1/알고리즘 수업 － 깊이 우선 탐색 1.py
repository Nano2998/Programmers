import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m,r = map(int,input().split())
graph = [[] for _ in range(n+1)]
visited = [0] * (n+1)
cnt = 1

for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)


def dfs(visited,start,graph):
    global cnt
    visited[start] = cnt
    cnt += 1
    for i in sorted(graph[start]):
        if not visited[i]:
            dfs(visited,i,graph)

dfs(visited,r,graph)

for i in range(1,n+1):
    print(visited[i])