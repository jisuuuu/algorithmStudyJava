package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class2_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            nums[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += nums[i][i];
            sum2 += nums[i][n- i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}
