package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] student = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int max = student[0];

        for (int i = 1; i < n; i++) {
            if (max < student[i]) {
                count++;
                max = student[i];
            }
        }
        System.out.println(count);
    }
}