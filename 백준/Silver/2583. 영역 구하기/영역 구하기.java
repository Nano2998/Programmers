import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[][] visited;
    static int m,n,k;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;
    static ArrayList<Integer> arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); // 높이
        n = Integer.parseInt(st.nextToken()); // 가로
        k = Integer.parseInt(st.nextToken()); // 개수

        arr = new ArrayList<>();
        graph = new boolean[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int new_x1 = x1;
            int new_y1 = m - y2;
            int new_x2 = x2 - 1;
            int new_y2 = m - y1 - 1;

            // 그래프 채우기
            for (int r = new_y1; r <= new_y2; r++) {
                for (int c = new_x1; c <= new_x2; c++) {
                    graph[r][c] = true;
                }
            }
        }


        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                if (!visited[j][k] && !graph[j][k]) {
                    count = 0;
                    dfs(j, k);
                    arr.add(count);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
}

    static void dfs(int x, int y) {
        visited[x][y] = true;
        count ++;

        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if (xx >= 0 && yy >= 0 && xx < m && yy < n) {
                if (!visited[xx][yy] && !graph[xx][yy]) {
                    dfs(xx, yy);
                }
            }
        }
    }
}