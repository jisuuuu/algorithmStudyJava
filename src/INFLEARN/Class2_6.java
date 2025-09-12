package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class2_6 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            String num = st.nextToken();
            int tmpNumber = Integer.parseInt(num);
            int res = 0;
            while (tmpNumber > 0) {
                int t = tmpNumber % 10;
                res = res * 10 + t;
                tmpNumber = tmpNumber / 10;
            }
            String tmp = "";

            for (int j = num.length() - 1; j >= 0; j--) {
                tmp += num.charAt(j);
            }
            if (isPrime(Integer.parseInt(tmp))) {
                System.out.print(Integer.parseInt(tmp) + " ");
            }
        }
    }
}
