import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[] arr;
    static int st,en,mid;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            bw.write(maxIndex(a,N) - minIndex(a,N) + " ");
        }
        
        bw.flush();
        bw.close();
    }

    static int minIndex(int target, int len) {
        st = 0;
        en = len;
        while (st < en) {
            mid = (st + en) / 2;
            if (arr[mid] >= target) {
                en = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }

    static int maxIndex(int target, int len) {
        st = 0;
        en = len;

        while (st < en) {
            mid = (st + en) / 2;
            if (arr[mid] > target) {
                en = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
}