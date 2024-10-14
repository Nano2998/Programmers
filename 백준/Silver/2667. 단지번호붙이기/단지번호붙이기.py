from collections import deque

def bfs(visited,graph,x,y):
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    dq = deque([(x,y)])
    visited[x][y] = 1
    cnt = 1

    while dq:
        a,b = dq.popleft()
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0 <= nx < n and 0 <= ny < n:
                if graph[nx][ny] == 1 and not visited[nx][ny]:
                    dq.append((nx,ny))
                    visited[nx][ny] = 1
                    cnt += 1        
    return cnt

n = int(input())

graph = []
arr = []
for _ in range(n):
    graph.append(list(map(int,input().strip())))

visited = [[0] * n for _ in range(n)]

for i in range(n):
    for j in range(n):
        if graph[i][j] == 1 and not visited[i][j]:
            arr.append(bfs(visited,graph,i,j))

arr.sort()
print(len(arr))
for i in arr:
    print(i)