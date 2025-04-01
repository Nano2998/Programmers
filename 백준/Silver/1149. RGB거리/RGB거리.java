import java.io.*;
import java.util.StringTokenizer;

/**
 * 3
 * 26 40 83
 * 49 60 57
 * 13 89 99
 */
public class Main {
    static int N;
    static int [][] dp;
    static int [] R, G, B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); // 집의 개수
        dp = new int[1005][3];
        R = new int[1005];
        G = new int[1005];
        B = new int[1005];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            R[i] = Integer.parseInt(st.nextToken());
            G[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        dp[1][0] = R[1];
        dp[1][1] = G[1];
        dp[1][2] = B[1];

        for (int i = 2; i <= N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + R[i];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + G[i];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + B[i];
        }

        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
    }
}