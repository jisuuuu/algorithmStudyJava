import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = 0;
        double result = 0;
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            score[i] = num;

            if (m < num) {
                m = num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (score[i] <= m) {
                result += (double) score[i] / m * 100;
            }
        }
        System.out.println(result / n);
    }
}
