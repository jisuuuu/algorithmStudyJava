package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] == 1) {
                count++;
                result += count;
            } else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}
