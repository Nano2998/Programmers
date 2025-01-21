import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = 0;
        int l = 0;
        for (int i = 0; i < 6; i++) {
            String s = br.readLine();
            if (s.equals("W")) {
                w++;
            } else {
                l++;
            }
        }

        if (w == 1 || w == 2) {
            System.out.println(3);
        } else if (w == 3 || w == 4) {
            System.out.println(2);
        } else if (w == 5 || w == 6) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

    }
}
