import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int mingok = 0;
        int manse = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 4; i++) {
            int x = Integer.parseInt(st.nextToken());
            mingok += x;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            int x = Integer.parseInt(st.nextToken());
            manse += x;
        }

        if (mingok > manse) {
            System.out.println(mingok);
        } else if ( mingok == manse) {
            System.out.println(mingok);
        } else {
            System.out.println(manse);
        }

    }
}