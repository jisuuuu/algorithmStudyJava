package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8_2 {
    static int answer = Integer.MIN_VALUE;
    static int n, c;

    public static void dfs(int l, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int[] puppies = new int[n];

        for (int i = 0; i < n; i++) {
            int puppy = Integer.parseInt(br.readLine());
            puppies[i] = puppy;
        }

        dfs(0, 0, puppies);
        System.out.println(answer);
    }
}
