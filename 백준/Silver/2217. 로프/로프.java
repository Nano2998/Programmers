import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n;
    static Integer[] lopes;
    static ArrayList<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        lopes = new Integer[n];

        for (int i = 0; i < n; i++) {
            lopes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lopes,Collections.reverseOrder());

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = Math.max(total, lopes[i] * (i + 1));
        }
        
        System.out.println(total);

    }

}