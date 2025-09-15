package INFLEARN.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Class5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') {
                }

            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
        System.out.println();
    }
}
