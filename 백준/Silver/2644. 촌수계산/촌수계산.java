import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 사람의 수
        int n = Integer.parseInt(br.readLine());

        // 구해야 하는 두 사람의 번호
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1]; // n+1 크기로 변경
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) { // 모든 사람의 인덱스 초기화
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        bfs(a, b, graph, visited, arr);

        // 연결되지 않은 경우 -1 출력
        System.out.println(arr[b] == 0 ? -1 : arr[b]);
    }

    static void bfs(int start, int end, ArrayList<Integer>[] graph, boolean[] visited, int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        arr[start] = cnt;
        while (!q.isEmpty()) {
            int index = q.poll();
            for (int i : graph[index]) {
                if (!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    arr[i] = arr[index] + 1;
                }
            }
        }
    }
}