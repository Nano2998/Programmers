import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long start = 1L;

        while(T > 0) {
            long left = 0L;
            long right = 1_000_000_000L;
            long result = 0;
            long N = Long.parseLong(br.readLine());

            while (left <= right) {
                long mid = (left + right) / 2;
                long sum = (mid * (mid + 1)) / 2;
                if (sum <= N) {
                    result = Math.max(mid,result);
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            sb.append(result).append("\n");
            T--;
        }
        System.out.println(sb);

        br.close();
    }
}