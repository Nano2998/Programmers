import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력값 읽기
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        // 합계 계산
        int sum = S + K + H;

        if (sum >= 100) {
            // 참여도의 합이 100 이상이면 "OK" 출력
            System.out.println("OK");
        } else {
            // 참여도가 가장 낮은 대학 찾기
            if (S < K && S < H) {
                System.out.println("Soongsil");
            } else if (K < S && K < H) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}