import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        int maxNum = 5;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            if (b < maxNum) {
                maxNum = b;
                arr.add(a);
            }
        }
        int len = arr.size()-1;
        System.out.println(arr.get(len));
    }
}