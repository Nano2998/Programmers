import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 1부터 n까지의 숫자
        char d = input[1].charAt(0);       // 찾을 숫자

        int count = 0;

        // 1부터 n까지 모든 숫자를 문자열로 변환해 숫자 d를 찾음
        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            for (char c : number.toCharArray()) {
                if (c == d) {
                    count++;
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}