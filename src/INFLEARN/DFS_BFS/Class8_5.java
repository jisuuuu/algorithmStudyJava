package INFLEARN.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Class8_5 {
    static int n, m;
    static int answer = Integer.MAX_VALUE;

    public static void dfs(int l, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (l >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(l, answer);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Integer[] coin = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        m = Integer.parseInt(br.readLine());

        Arrays.sort(coin, Collections.reverseOrder());

        dfs(0, 0, coin);
        System.out.println(answer);
    }
}
