import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static Integer[] arr;
    static int start,end,middle;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(a));
        }

    }

    static int binarySearch(int target) {
        start = 0;
        end = N - 1;

        while (start <= end) {
            middle = (start + end) / 2;

            if (arr[middle] < target) {
                start = middle + 1;
            } else if(arr[middle] > target) {
                end = middle - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}