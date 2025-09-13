package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Class5_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int b = stack.pop();
                int a = stack.pop();

                if (x == '+') {
                    stack.push(a + b);
                } else if (x == '*') {
                    stack.push(a * b);
                } else if (x == '/') {
                    stack.push(a / b);
                } else {
                    stack.push(a - b);
                }
            }
        }
        System.out.println(stack.get(0));
    }
}
