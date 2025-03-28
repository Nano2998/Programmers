import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int n;
    static boolean[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count = 0;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new boolean[n][n];
        visited = new boolean[n][n];
        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    graph[i][j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && graph[i][j]) {
                    count = 0;
                    dfs(i, j);
                    arr.add(count);
                }
            }
        }
        System.out.println(arr.size());
        Collections.sort(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    static void dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return; 
        }
        if (visited[x][y] || !graph[x][y]) {
            return; 
        }

        visited[x][y] = true;
        count++;

        for (int k = 0; k < 4; k++) {
            int numX = x + dx[k];
            int numY = y + dy[k];

             dfs(numX,numY);
            }
        }
    }