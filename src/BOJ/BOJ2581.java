package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = getPrimeArray(new boolean[n + 1]);

        int total = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                total += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }

    public static boolean[] getPrimeArray(boolean[] prime) {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        return prime;
    }
}
