import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        if (t == 0) {
            System.out.println("YONSEI");
        } else {
            System.out.println("Leading the Way to the Future");
        }
    }
}