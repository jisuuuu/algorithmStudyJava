package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] origin = new int[]{1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print(origin[i] - nums[i] + " ");
        }
    }
}
