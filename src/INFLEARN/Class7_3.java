package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7_3 {
    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(dfs(n));
    }
}
