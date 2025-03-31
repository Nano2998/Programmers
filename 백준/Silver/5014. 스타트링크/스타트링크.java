import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // 1 -> 3 -> 5 -> 7 -> 9 -> 8 -> 10
    static int F,S,G;
    static int[] dir = new int[2];
    static int[] move;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken()); // 전체 층 10
        S = Integer.parseInt(st.nextToken()); // 현재 층 1
        G = Integer.parseInt(st.nextToken()); // 도착 층 10
        dir[0] = Integer.parseInt(st.nextToken()); // 위로 가는 버튼 2
        dir[1] = Integer.parseInt(st.nextToken()) * -1; // 아래로 가는 버튼 1

        move = new int[F + 1];
        visited = new boolean[F + 1];

        bfs(S);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;
        move[start] = 0;

        while (!q.isEmpty()) {
            int pos = q.poll();

            if (pos == G) {
                System.out.println(move[pos]);
                return;
            }

            for (int i = 0; i < 2; i++) {
                int next = pos + dir[i];

                if(next > F || next < 1) continue;

                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    move[next] = move[pos] + 1;
                }
            }
        }
        System.out.println("use the stairs");
    }
}