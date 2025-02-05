import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static boolean [][] visited;
    static ArrayList<Integer> graph = new ArrayList<>();
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] arr;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    dfs(i,j);
                    graph.add(cnt);
                }
            }
        }

        Collections.sort(graph);
        System.out.println(graph.size());
        for (Integer i : graph) {
            System.out.println(i);
        }
    }

    static void dfs(int x, int y ) {
        visited[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx  = x + dx[i];
            int ny  = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                continue;
            }

            if (!visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx,ny);
            }
        }
    }
}
