package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int num = 0;

        for (int i = 1; i <= 9; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > max) {
                max = value;
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
