import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> x_arr = new ArrayList<Integer>();
        List<Integer> y_arr = new ArrayList<Integer>();


        x_arr.add(Integer.parseInt(st.nextToken())); // 가로
        y_arr.add(Integer.parseInt(st.nextToken())); // 세로

        x_arr.add(0);
        y_arr.add(0);

        int cut = Integer.parseInt(br.readLine()); // 자르는 횟수

        for (int i = 0; i < cut; i++) {

            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());

            if (type == 0) {
                y_arr.add(point);
            } else {
                x_arr.add(point);
            }
        }

        Collections.sort(y_arr);
        Collections.sort(x_arr);

        int width = 0;
        int height = 0;
        int resMax = 0;

        for (int i = 1; i < x_arr.size(); i++) {
            for (int j = 1; j < y_arr.size(); j++) {
                width = x_arr.get(i) - x_arr.get(i - 1);
                height = y_arr.get(j) - y_arr.get(j - 1);
                resMax = Math.max(resMax, width * height);
            }
        }
        
        System.out.println(resMax);
    }
}