package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] strings = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        System.out.print(nums[0] + " ");

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
