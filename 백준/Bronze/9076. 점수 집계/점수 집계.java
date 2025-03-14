import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;

            Arrays.sort(arr);
            for (int i = 1; i < 4; i++) {
                sum += arr[i];
            }

            if (arr[3] - arr[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(sum);
            }
        }
    }
}