package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Class3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (nArr[p1] < mArr[p2]) {
                answer.add(nArr[p1++]);
            } else {
                answer.add(mArr[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(nArr[p1++]);
        }
        while (p2 < m) {
            answer.add(mArr[p2++]);
        }


        for (int s : answer) {
            System.out.print(s + " ");
        }
    }
}
