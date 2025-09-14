package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class6_4 {
    public static int[] solution(int size, int n, int[] arr) {
        int[] answer = new int[size];

        for (int a : arr) {
            int pos = -1;

            for (int i = 0; i < size; i++) {
                if (a == answer[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = a;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int work[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int w : solution(s, n, work)) {
            System.out.print(w + " ");
        }
    }
}
