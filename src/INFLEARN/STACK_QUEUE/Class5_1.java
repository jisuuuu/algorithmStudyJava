package INFLEARN.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Class5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    flag = false;
                    System.out.println("NO");
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            flag = false;
            System.out.println("NO");
        }

        if (flag) {
            System.out.println("YES");
        }

    }
}
