import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                cnt += N / 5;
                System.out.println(cnt);
                return; // 프로그램 종료
            }
            N -= 2;
            cnt++;
        }

        // N이 0이 된 경우에만 cnt를 출력
        if (N == 0) {
            System.out.println(cnt);
        } else {
            System.out.println(-1); // 1이 남거나 2로 나눌 수 없는 경우 -1 출력
        }
    }
}