import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());  // 몬스터 방어율 200
        double b = Double.parseDouble(st.nextToken());  // 유저 방무 수치 20

        double effectiveArmor = a * (1 - (b / 100.0));  // 체감 방어율 계산
        if (Math.abs(effectiveArmor - 100) < 1e-9) {
            System.out.println(0);  // 대미지를 줄 수 없음
        } else if (effectiveArmor >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);  // 대미지를 줄 수 있음
        }
    }
}
