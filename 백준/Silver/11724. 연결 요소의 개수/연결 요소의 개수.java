import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean visited[];
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }

        System.out.println(cnt);
    }

    public static void dfs(int V) {
        if (visited[V]) {
            return;
        }

        visited[V] = true;

        for (int idx : graph[V]) {
            if (!visited[idx]) {
                dfs(idx);
            }
        }

    }
}