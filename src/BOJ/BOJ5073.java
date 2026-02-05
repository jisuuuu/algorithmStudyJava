package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = a;
            max = Math.max(max, b);
            max = Math.max(max, c);
            int total = a + b + c;

            if (a == b && b == c && c == 0) {
                break;
            }

            if (max >= total - max) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
