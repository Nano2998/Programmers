import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            for (int j = 0; j <= a; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}