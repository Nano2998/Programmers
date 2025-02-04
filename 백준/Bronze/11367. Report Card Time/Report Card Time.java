import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(" ");
            int a = Integer.parseInt(st.nextToken());
            if (a <= 59) {
                sb.append("F");
            } else if (a <= 66) {
                sb.append("D");
            } else if (a <= 69) {
                sb.append("D+");
            }else if (a <= 76) {
                sb.append("C");
            }else if (a <= 79) {
                sb.append("C+");
            }else if (a <= 86) {
                sb.append("B");
            }else if (a <= 89) {
                sb.append("B+");
            }else if (a <= 96) {
                sb.append("A");
            }else if (a <= 100) {
                sb.append("A+");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}