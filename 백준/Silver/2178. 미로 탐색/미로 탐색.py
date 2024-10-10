from collections import deque

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(graph,start,visited,n,m):
    dq = deque([start])
    visited[start[0]][start[1]] = 1

    while dq:
        x,y = dq.popleft()
        for i in range(4):
            nx, ny = x + dx[i] , y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and visited[nx][ny] == 0 and graph[nx][ny] == 1:
                visited[nx][ny] = visited[x][y] + 1
                dq.append((nx,ny))
                
    print(visited[n-1][m-1])
n,m = map(int,input().split())
visited = [[0] * m for _ in range(n)]
graph = [ [0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    a = input()
    for j in range(len(a)):
        graph[i][j] = int(a[j])

bfs(graph,(0,0),visited,n,m)