package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int lt = 0;
        int sum = 0;
        int answer = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if (sum == m) {
                answer++;
            }
            while (sum > m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
