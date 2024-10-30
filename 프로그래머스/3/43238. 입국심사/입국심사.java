import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long start = 0L;
        long end = 1_000_000_000 * 1_000_000_000L;
        long answer = 0;
        Arrays.sort(times);
        while(start <= end) {
            long mid = (start + end) / 2;
            long result = 0;
            for(long time : times) {
                result += mid / time;
            }
            if (result < n){
                start = mid + 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }
        return answer;
    }
}