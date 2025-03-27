import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long a = Long.parseLong(br.readLine());
        Long b = Long.parseLong(br.readLine());
        Long c = Long.parseLong(br.readLine());

        String sum = String.valueOf(a * b * c);

        int[] arr = new int[10];

        for ( char ch : sum.toCharArray()) {
            arr[ch - '0']++;
        }

        for (int i : arr) {
            System.out.println(i);
        }


    }
}