import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<Integer> graph = new ArrayList<>();
    static int cnt;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int height;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }
        int maxcnt = 1;

        for (int height = 1; height <= maxHeight; height++) {

            cnt = 0;
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && arr[i][j] > height) {
                        dfs(i, j,height);
                        cnt++;
                    }
                }
            }
            maxcnt = Math.max(cnt, maxcnt);
        }

        System.out.println(maxcnt);
    }

    static void dfs(int x, int y,int height) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && arr[nx][ny] > height) {
                    dfs(nx,ny,height);
                }
            }
        }
    }
}
