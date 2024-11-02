import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        long left = 0;
        long right = 2000000000;
        long answer = 0;
        StringTokenizer stt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stt.nextToken());
        }

        while( left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int i = 0; i < n; i++){
                if (arr[i] > mid) {
                    sum += (int) (arr[i] - mid);
                }
            }

            if (sum >= m) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}