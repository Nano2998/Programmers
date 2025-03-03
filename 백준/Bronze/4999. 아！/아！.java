import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = br.readLine();
        int b = 0;
        int b1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                b++;
            }
        }

        for (int j = 0; j < s1.length(); j++) {
            if (s1.charAt(j) == 'a') {
                b1++;
            }
        }

        if (b < b1) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }

    }
}