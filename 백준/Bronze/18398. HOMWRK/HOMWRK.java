import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int j = 0; j < t; j++ ) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int i1 = Integer.parseInt(st.nextToken());
                int i2 = Integer.parseInt(st.nextToken());

                System.out.println(i1 + i2 + " " + i1 * i2);
            }
        }
    }
}