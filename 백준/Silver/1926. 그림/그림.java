import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int n,m;
    static boolean[][] graph;
    static boolean[][] visited;

    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    static int pictureCount = 0;
    static int count = 0; // 개수
    static int maxCount = 0; // 가장 넓은 크기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new boolean[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (input == 1) {
                    graph[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && graph[i][j]) {
                    pictureCount++;
                    dfs(i, j);

                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
        }
        System.out.println(pictureCount);
        System.out.println(maxCount);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for (int k = 0; k < 4; k++) {
            int xx = x + dx[k];
            int yy = y + dy[k];

            if (xx >= 0 && yy >= 0 && xx < n && yy < m) {
                if (!visited[xx][yy] && graph[xx][yy]) {
                    dfs(xx, yy);
                }
            }
        }
    }
}