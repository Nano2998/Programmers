import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) { 
                int diff = arr[i] - arr[i + 1] + 1; 
                cnt += diff;
                arr[i] -= diff;
            }
        }
        System.out.println(cnt);
    }
}