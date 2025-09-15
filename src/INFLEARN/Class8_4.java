package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8_4 {
    static int n, m;
    static int[] pm;

    public static void dfs(int l) {
        if (l == m) {
            for (int p : pm) {
                System.out.print(p + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                dfs(l + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pm = new int[m];

        dfs(0);
    }
}
