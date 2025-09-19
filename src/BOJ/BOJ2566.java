package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[9][9];
        int max = Integer.MIN_VALUE, pI = 0, pJ = 0;

        for (int i = 0; i < 9; i++) {
            nums[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    pI = i + 1;
                    pJ = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(pI + " " + pJ);
    }
}
