import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        if (i == 60 && j == 60 && k == 60) {
            System.out.println("Equilateral");
        }
        else if (i+j+k == 180 && (i == j || j == k || i == k)) {
            System.out.println("Isosceles");
        }
        else if (i+j+k == 180) {
            System.out.println("Scalene");
        }
        else {
            System.out.println("Error");
        }

    }
}