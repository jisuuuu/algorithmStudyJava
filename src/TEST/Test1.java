package TEST;

import java.util.Stack;

public class Test1 {
    public static int solution(String S) {
        if (S == null) return -1;
        String[] tokens = S.trim().isEmpty() ? new String[0] : S.trim().split("\\s+");
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (isNumber(s)) {
                long longCheck = Long.parseLong(s);
                if (longCheck < 0 || longCheck >= 1048575) {
                    return -1;
                }
                stack.push((int) longCheck);
            } else if (s.equals("+")) {
                if (stack.size() < 2) {
                    return -1;
                }
                int a = stack.pop();
                int b = stack.pop();
                long sum = (long) a + (long) b;

                if (sum < 0 || sum >= 1048575) {
                    return -1;
                }
                stack.push((int) sum);
            } else if (s.equals("-")) {
                if (stack.size() < 2) {
                    return -1;
                }
                int a = stack.pop();
                int b = stack.pop();
                int sum = a - b;

                if (sum < 0) {
                    return -1;
                }
                stack.push(sum);
            } else if (s.equals("DUP")) {
                if (stack.isEmpty()) {
                    return -1;
                }
                stack.push(stack.peek());
            } else if (s.equals("POP")) {
                if (stack.isEmpty()) {
                    return -1;
                }
                stack.pop();
            } else {
                return -1;
            }
        }
        return stack.isEmpty() ? -1 : stack.peek();
    }
    private static boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solution("4 5 6 - 7 +"));
        System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
        System.out.println(solution("3 DUP 5 - -"));
        System.out.println(solution("1048575 DUP"));
        System.out.println(solution("5 6 + -"));
    }
}
