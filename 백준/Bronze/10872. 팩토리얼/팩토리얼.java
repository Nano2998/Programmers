import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1;

        if (N == 0) {
            System.out.println(1); // 0! = 1
        } else {
            for (int i = 1; i <= N; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
    }
}