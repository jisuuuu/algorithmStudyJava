package INFLEARN.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class8_1 {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;

    public static void dfs(int l, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (l == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        total = Arrays.stream(nums).sum();

        dfs(0, 0, nums);
        System.out.println(answer);
    }
}
