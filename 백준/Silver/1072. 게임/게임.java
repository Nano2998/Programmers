import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static int x,y;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        int z = getPercent(x,y);

        int low = 0;
        int high = (int)1e9;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2 ;

            if (getPercent(x + mid, y + mid) != z) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    static int getPercent(int x, int y) {
        return (int) ((long) y * 100 / x);
    }
}