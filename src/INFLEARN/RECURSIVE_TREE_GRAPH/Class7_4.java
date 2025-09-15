package INFLEARN.RECURSIVE_TREE_GRAPH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7_4 {
    static int[] fibo;
    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return dfs(n - 2) + dfs(n - 1);
        }
    }

    public static int dfsmemo(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = dfsmemo(n - 2) + dfsmemo(n - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(dfs(i) + " ");
        }

        fibo = new int[n + 1];
        dfsmemo(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
