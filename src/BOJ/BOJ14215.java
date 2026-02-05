package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = a;
        max = Math.max(max, b);
        max = Math.max(max, c);
        int total = a + b + c;

        if (max < total - max) {
            System.out.println(total);
        } else {
            System.out.println(total - max + total - max - 1);
        }
    }
}
