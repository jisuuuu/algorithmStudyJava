package INFLEARN.RECURSIVE_TREE_GRAPH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7_6 {
    static int n;
    static int[] memo;

    public static void dfs(int l) {
        if (l == n + 1) {
            for (int i = 1; i < n + 1; i++) {
                if (memo[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            memo[l] = 1;
            dfs(l + 1);
            memo[l] = 0;
            dfs(l + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new int[n + 1];
        dfs(1);
    }
}
