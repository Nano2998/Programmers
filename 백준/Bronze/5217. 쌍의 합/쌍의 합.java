import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine()); // 입력하는 숫자
            System.out.print("Pairs for " + M + ": ");
            
            boolean firstPair = true;
            for (int j = 1; j < M; j++) {
                for (int k = j + 1; k < M; k++) {
                    if (j + k == M) {
                        if (!firstPair) {
                            System.out.print(", ");
                        }
                        System.out.print(j + " " + k);
                        firstPair = false;
                    }
                }
            }
            System.out.println();
        }
        
        br.close();
        bw.close();
    }
}