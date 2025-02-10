import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List<String[]> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String mentor = st.nextToken();
            String mentee = st.nextToken();
            pairs.add(new String[]{mentor, mentee});
        }

        pairs.sort((a, b) -> {
            if (a[0].equals(b[0])) {
                return b[1].compareTo(a[1]);
            }
            return a[0].compareTo(b[0]);
        });

        for (String[] pair : pairs) {
            System.out.println(pair[0] +" "+ pair[1]);
        }

    }
}