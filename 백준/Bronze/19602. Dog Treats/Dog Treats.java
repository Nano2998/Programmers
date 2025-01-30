import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        int a = 1 * s + 2 * m + 3 * l;

        if (a >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}