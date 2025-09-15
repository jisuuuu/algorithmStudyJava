package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8_8 {
    static int[][] memo = new int[35][35];

    public static int dfs(int n, int r) {
        if (memo[n][r] > 0) {
            return memo[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return memo[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println(dfs(n, r));
    }
}
