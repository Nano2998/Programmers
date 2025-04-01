import java.io.*;

/**
 * 6
 * 10 못밟
 * 20 밟
 * 15 밟
 * 25 밟
 * 10 못밟
 * 20 밟
 */
public class Main {
    static int stair;
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stair = Integer.parseInt(br.readLine()); // 계단 수
        dp = new int[301]; // DP 정의
        arr = new int[301]; // 계단 정의

        for (int i = 1; i <= stair; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 계단 입력
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for (int i = 3; i <= stair; i++) {
            dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
        }

        System.out.println(dp[stair]);

    }
}