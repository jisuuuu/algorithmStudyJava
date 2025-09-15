package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] nums = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (nums[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    nums[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
