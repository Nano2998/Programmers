import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int t;
    static int max, min;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(br.readLine());
            max = -1000001;
            min = 1000001;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                int number = Integer.parseInt(st.nextToken());
                max = Math.max(number, max);
                min = Math.min(number, min);
            }
            bw.write(min + " " + max + "\n");
        }
        bw.flush();
        bw.close();
    }
}