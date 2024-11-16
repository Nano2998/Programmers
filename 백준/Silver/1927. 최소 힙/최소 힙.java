import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> mH = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(mH.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(mH.poll()).append("\n");
                }
            } else {
                mH.add(x);
            }
        }
        System.out.println(sb);
    }
}