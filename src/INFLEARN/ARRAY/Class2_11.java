package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class2_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] student = new int[n + 1][6];

        for (int i = 1; i < n + 1; i++) {
            String tmp = "0 " + br.readLine();
            student[i] = Arrays.stream(tmp.split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (student[i][k] == student[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
