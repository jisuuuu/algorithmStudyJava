package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
