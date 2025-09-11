package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = a;

        if (b == c && c == a) {
            System.out.println(10000 + a * 1000);
        } else if (a != b && b != c && c != a) {
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.println(100 * max);
        } else {
            if (a != b) {
                System.out.println(1000 + c * 100);
            } else {
                System.out.println(1000 + b * 100);
            }
        }
    }
}
