import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxPeople = 0; // 최대 사람 수
        int currentPeople = 0; // 현재 기차 안의 사람 수

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 내린 사람
            int b = Integer.parseInt(st.nextToken()); // 탄 사람

            currentPeople -= a; // 내린 사람 처리
            currentPeople += b; // 탄 사람 처리

            maxPeople = Math.max(maxPeople, currentPeople); // 최대 인원 갱신
        }

        System.out.println(maxPeople);
    }
}