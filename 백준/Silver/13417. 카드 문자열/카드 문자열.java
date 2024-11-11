import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        // 테스트케이스 수 만큼 반복
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Deque<String> dq = new ArrayDeque<>(); // dq 선언
            dq.add(st.nextToken());

            for(int j = 1; j < N; j++) {
                String s = st.nextToken();

                // 만약 dq가 s보다 사전순 앞에 있다면 뒤에 붙이고 아니라면 앞에 붙임
                if(dq.getFirst().compareTo(s) < 0) {
                    dq.addLast(s);
                } else
                    dq.addFirst(s);
            }
            for (String s : dq) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}