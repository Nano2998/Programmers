import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long i = Long.parseLong(br.readLine());
        long sum = 1;

        for (long j = 1; j <= i; j++) {
            sum *= j;
        }
        System.out.println(sum);
    }
}