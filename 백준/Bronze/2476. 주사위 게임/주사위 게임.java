import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum = 0;

            if (a == b && b == c) {
                sum = 10000 + (a * 1000);
            } else if (a == b || a == c ) {
                sum = 1000 + (a * 100);
            } else if (b == c) {
                sum = 1000 + (b * 100);
            } else {
                int max1 = Math.max(a, b);
                int max2 = Math.max(max1, c);
                sum = max2 * 100;
            }

            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
