package INFLEARN.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8_9 {
    static int[] b, p, ch;
    static int n, f;
    static boolean flag = false;
    static int[][] memo = new int[35][35];

    public static int combi(int n, int r) {
        if (memo[n][r] > 0) {
            return memo[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return memo[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public static void dfs(int l, int sum) {
        if (flag) {
            return;
        }
        if (l == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                System.out.println();
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[l] = i;
                    dfs(l + 1, sum + (p[l] * b[l]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; //체크가 숫자를 1부터 사용하기 때문에

        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }

        dfs(0, 0);
    }
}
