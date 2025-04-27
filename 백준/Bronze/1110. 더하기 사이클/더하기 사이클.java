import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        if (n.length() == 1) {
            n = "0" + n;
        }

        String original = n;
        int cnt = 0;

        while (true) {
            int n1 = Integer.parseInt(String.valueOf(n.charAt(0)));
            int n2 = Integer.parseInt(String.valueOf(n.charAt(1)));

            int sum = n1 + n2;
            String sumStr = String.valueOf(sum);
            String newN = "" + n.charAt(1) + sumStr.charAt(sumStr.length() - 1);

            cnt++;
            if (newN.equals(original)) {
                break;
            }
            n = newN;
        }

        System.out.println(cnt);
    }
}
