from collections import deque

dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]

def bfs(visited,start,graph,n,m):
    dq = deque([start])
    visited[start[0]][start[1]] = True

    while dq:
        x, y = dq.popleft()
        for i in range(4):
            nx, ny = x + dx[i] , y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and graph[nx][ny] == 1:
                visited[nx][ny] = True
                dq.append((nx, ny))


t = int(input())

for _ in range(t):
    m,n,k = map(int,input().split())

    graph = [[0 for _ in range(m)] for _ in range(n)]
    visited = [[False] * m for _ in range(n)]

    for i in range(k):
        x,y = map(int,input().split())
        graph[y][x] = 1

    cnt = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1 and not visited[i][j]:
                bfs(visited, (i, j), graph, n, m)
                cnt += 1
    # for i in graph:
    #     print(i)

    print(cnt)