import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        for (int i = 0; i < s; i++) {
            String a = br.readLine();

            if (a.length() >= 10 || a.length() <= 5) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

    }
}