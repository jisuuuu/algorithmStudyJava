package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8_3 {
    static int n, m, answer = Integer.MIN_VALUE;

    public static void dfs(int l, int sum, int time, int[] t, int[] s) {
        if (time > m) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l + 1, sum + s[l], time + t[l], t, s);
            dfs(l + 1, sum, time, t, s);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] time = new int[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            time[i] = t;
            score[i] = s;
        }

        dfs(0, 0, 0, time, score);
        System.out.println(answer);
    }
}
