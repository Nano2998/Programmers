import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] dp = new int[A];
        int[] a = new int[A];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < A; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
            a[i] = dp[i];
        }

        for(int i = 1; i < A; i++) {
            for(int j = 0; j < i; j++) {
                if(a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + a[i]);
                }
            }
        }

        for (int i : dp) {
            max = Math.max(max, i);
        }

        System.out.println(max);

    }
}