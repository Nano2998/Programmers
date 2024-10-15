from collections import deque

def bfs(graph,visited,x,y,n,m):
    dq = deque([(x,y)])
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    p = 0
    visited[x][y] = True

    while dq:
        a,b = dq.popleft()
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]
            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and not graph[nx][ny] == "X":
                dq.append((nx,ny))
                visited[nx][ny] = True
                if graph[nx][ny] == "P":
                    p += 1
    if p == 0:
        print("TT")
    else:
        print(p)

n,m = map(int,input().split())

graph = []
visited = [[False] * m for _ in range(n)]

for _ in range(n):
    graph.append(list(map(str,input().rstrip())))

for i in range(n):
    for j in range(m):
        if graph[i][j] == "I":
            bfs(graph,visited,i,j,n,m)