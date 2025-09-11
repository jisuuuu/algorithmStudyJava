package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if (b + c < 60) {
            System.out.println(a + " " + (b + c));
        } else {
            if ((a + (b + c) / 60) >= 24) {
                System.out.println(((a + (b + c) / 60) % 24) + " " + ((b + c) % 60));
            } else {
                System.out.println((a + (b + c) / 60) + " " + ((b + c) % 60));
            }
        }
    }
}
