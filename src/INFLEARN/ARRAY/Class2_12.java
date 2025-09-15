package INFLEARN.ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class2_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] scores = new int[m][n];

        for (int i = 0; i < m; i++) {
            scores[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {// 학생 비교
            for (int j = 1; j <= n; j++) {// 학생 비교
                int cnt = 0;
                for (int k = 0; k < m; k++) {//테스트 갯수
                    int result_i = 0;
                    int result_j = 0;
                    for (int s = 0; s < n; s++) {//등수 갯수
                        if (scores[k][s] == i) {
                            result_i = s;
                        }
                        if (scores[k][s] == j) {
                            result_j = s;
                        }
                    }
                    if (result_i < result_j) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
