import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[n+1];
        boolean [] visited = new boolean[n + 1];
        int [] arr = new int[n+1];

        // 그래프 크기 선언
        for(int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
            arr[i] = -1;
        }

        // 그래프에 값 집어넣기
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }
        bfs(x,arr,visited,graph);


        boolean found = false;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == k) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }

    static void bfs(int start, int [] arr, boolean[] visited, ArrayList<Integer> [] graph) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        arr[start] = cnt;
        while(!q.isEmpty()) {
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
