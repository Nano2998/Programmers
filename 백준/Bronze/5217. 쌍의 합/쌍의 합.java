import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < N; i++){
            int M = Integer.parseInt(br.readLine()); // 입력하는 숫자
            System.out.print("Pairs for " + M +": ");
            for (int j = 0; j < M; j++){
                for (int k = 0; k < M; k++) {
                    if (j < k) {
                        if (j < 2) {
                            if (j + k == M) {
                                System.out.print(j);
                                System.out.print(" " + k);
                            }
                        } else {
                            if (j + k == M) {
                                System.out.print(", " + j);
                                System.out.print(" " + k);
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
