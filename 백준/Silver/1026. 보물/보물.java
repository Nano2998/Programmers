import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * 5
 * 1 1 1 6 0
 * 2 7 8 3 1
 */

public class Main {
    static int n;
    static Integer[] A, B;
    static int s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        A = new Integer[n];
        B = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine()); // A배열 입력
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // B배열 입력
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            s += A[i] * B[i];
        }

        System.out.println(s);


    }
}