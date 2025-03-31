import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Stack<Character> leftStack;
    static Stack<Character> rightStack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        leftStack = new Stack<>();
        rightStack = new Stack<>();

        String s = br.readLine(); // abcd

        for (int i = 0; i < s.length(); i++) {
            leftStack.add(s.charAt(i));
        }

        int m = Integer.parseInt(br.readLine()); // 3

        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            char c = s1.charAt(0);

            if (c == 'P') {
                leftStack.push(s1.charAt(2));
            } else if (c == 'L') {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (c == 'B') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (c == 'D') {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }

        System.out.println(sb.toString());

    }
}