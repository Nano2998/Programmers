import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int[] arr;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수

        arr = new int[N + 1];
        visited = new boolean[N + 1];

        //초기화
        graph = new ArrayList[N + 1];
        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        //그래프 저장
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
        }


        int S = Integer.parseInt(br.readLine()); // 팬 인원
        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < S; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[a] = 1; // 해당 팬 배열에 저장
        }

        if (dfs(1)) {
            System.out.println("yes");
        } else {
            System.out.println("Yes");
        }
    }
    static boolean dfs(int start) {
        visited[start] = true;
        // 팬을 만난 경우, 이 경로는 유효하지 않음
        if (arr[start] == 1) {
            return false;
        }

        // 리프 노드에 도달했을 경우
        if (graph[start].isEmpty()) {
            return true;
        }
        for (int node : graph[start]) {
            if(!visited[node]) {
                if(dfs(node)) {
                    return  true;
                }
            }
        }
        return false;
    }
}
