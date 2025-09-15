package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Block implements Comparable<Block> {
    int s;
    int h;
    int w;

    public Block(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Block o) {
        return o.s - this.s;
    }
}
public class Class10_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Block> arr = new ArrayList<>();
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arr.add(new Block(s, h, w));
        }

        Collections.sort(arr);
        dp[0] = arr.get(0).h;
        int answer = dp[0];

        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dp[j] > max_h) {
                    max_h = dp[j];
                }
            }
            dp[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
