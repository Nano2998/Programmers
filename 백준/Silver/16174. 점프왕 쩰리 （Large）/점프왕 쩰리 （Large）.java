import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 방문 체크
        boolean[][] visited = new boolean[N][N];

        // 그래프 정의
        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph [i][j] =Integer.parseInt(st.nextToken());
            }
        }

        if (dfs(graph, visited, 0, 0,N)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    public static boolean dfs(int[][] graph, boolean[][] visited, int x, int y, int N) {
        visited[x][y] = true;
        if (graph[x][y] == -1) {
            return true;
        }

        int[] dx = {1, 0};
        int[] dy = {0, 1};

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i] * graph[x][y];
            int ny = y + dy[i] * graph[x][y];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny]) {
                continue;
            }
            if (dfs(graph, visited, nx, ny, N)) {
                return true;
            }
        }
        return false;
    }
}