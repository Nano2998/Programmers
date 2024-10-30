import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main extends Exception{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> mH = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if(mH.isEmpty()) {
                    sb.append("0").append("\n");
                }
                else{
                    sb.append(mH.poll()).append("\n");
                }
            } else {
                mH.add(x);
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}