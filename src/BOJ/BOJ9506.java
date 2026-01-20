package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            List<Integer> nums = getDivisor(n);

            if (nums == null) {
                sb.append(n + " is NOT perfect.\n");
                continue;
            }
            sb.append(n + " = ");
            for (int i = 0; i < nums.size() - 1; i++) {
                sb.append(nums.get(i) + " + ");
            }
            sb.append(nums.get(nums.size() - 1) + "\n");

        }
        System.out.println(sb);
    }

    public static List<Integer> getDivisor(int n) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);

        int total = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                nums.add(i);
                nums.add(n / i);
                total += i + (n / i);
            }
        }

        if (total != n) {
            return null;
        } else {
            Collections.sort(nums);
            return nums;
        }
    }
}
