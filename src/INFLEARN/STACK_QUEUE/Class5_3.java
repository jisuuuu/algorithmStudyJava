package INFLEARN.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Class5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int m = Integer.parseInt(br.readLine());
        int[] moves = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;

                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        cnt += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
