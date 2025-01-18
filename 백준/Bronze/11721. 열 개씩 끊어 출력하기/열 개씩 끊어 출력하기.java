import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            sb.append(N.charAt(i));
            if ((i+1) % 10 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
