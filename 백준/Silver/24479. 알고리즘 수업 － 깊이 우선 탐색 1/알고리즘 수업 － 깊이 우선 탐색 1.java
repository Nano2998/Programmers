import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main extends Exception {
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 수
        int M = Integer.parseInt(st.nextToken()); // 간선의 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        int[] visited = new int[N + 1]; // 방문 처리

        // 인접 리스트로 그래프 초기화
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        dfs(graph, visited, R);

        for (int j = 1; j <= N; j++) {
            System.out.println(visited[j]);
        }
    }

    public static void dfs(List<Integer>[] graph, int[] visited, int start) {
        visited[start] = cnt++;
        for (int neighbor : graph[start]) {
            if (visited[neighbor] == 0) {
                dfs(graph, visited, neighbor);
            }
        }
    }
}