import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        String word = br.readLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s; i++) {
            if (word.charAt(i) == 'e') {
                a++;
            } else {
                b++;
            }
        }
        if (a == b) {
            System.out.println("yee");
        } else if (a < b) {
            System.out.println("2");
        } else {
            System.out.println("e");
        }
    }
}