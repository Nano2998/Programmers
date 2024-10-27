import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);

        Long i = Long.parseLong(st.nextToken());
        Long j = Long.parseLong(st.nextToken());

        Long min = Math.min(i, j); // 작은 값을 min에
        Long max = Math.max(i, j); // 큰 값을 max에

        Long answer = max - min - 1;

        if (i.equals(j)) {  // 두 수가 같으면 0 출력
            bw.write("0\n");
        } else {
            bw.write(answer + "\n");
            // 두 수 사이에 있는 수들 출력
            for (Long k = min + 1; k < max; k++) {
                bw.write(k + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}