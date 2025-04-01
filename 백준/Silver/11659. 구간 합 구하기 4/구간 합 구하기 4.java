import java.io.*;
import java.util.StringTokenizer;


/**
 * 2x1 일땐 채울수 있는 방법 1개
 * 2x2 일땐 채울수 있는 방법 3개
 * 2x3 일땐 채울수 있는 방법 8개
 * 2x4 일땐 채울수 있는 방법
 */
public class Main {
    static int N,M;
    static int[] arr;
    static int [] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[100001];
        arr = new int[100001];
        dp[0] = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i - 1] + arr[i];
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            System.out.println(dp[k] - dp[j - 1]);
        }
    }
}