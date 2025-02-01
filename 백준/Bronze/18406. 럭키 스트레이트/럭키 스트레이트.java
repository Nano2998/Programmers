import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int len = s.length() / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < len; i++) {
            sum1 += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        for (int i = len; i < s.length(); i++) {
            sum2 += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        if (sum1 == sum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}