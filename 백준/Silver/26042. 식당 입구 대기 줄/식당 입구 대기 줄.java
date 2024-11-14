import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        int last = 100000;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.countTokens() == 1) {
                dq.poll();
            } else {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                dq.addLast(b);
                if (size < dq.size()) {
                    size = dq.size();
                    last = b;
                } else if (size == dq.size()) {
                    if (last > b) {
                        last = b;
                    }
                }

            }
        }
        System.out.println(size+" "+last);
    }
}