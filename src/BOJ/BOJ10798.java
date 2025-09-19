package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            chars[i] = (br.readLine()).toCharArray();

            if (max < chars[i].length) {
                max = chars[i].length;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                if (chars[i].length > j) {
                    sb.append(chars[i][j]);
                }
            }
        }
        System.out.println(sb);
    }
}
