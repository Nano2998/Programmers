import java.io.*;
import java.util.StringTokenizer;


/**
 * 2x1 일땐 채울수 있는 방법 1개
 * 2x2 일땐 채울수 있는 방법 3개
 * 2x3 일땐 채울수 있는 방법 8개
 * 2x4 일땐 채울수 있는 방법
 */
public class Main {
    static int N;
    static int [] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        dp[4] = 11;

        for (int i = 5; i <= N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]*2) % 10007;
        }

        System.out.println(dp[N]);
    }
}