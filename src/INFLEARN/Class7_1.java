package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7_1 {
    public static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dfs(n);
    }
}
