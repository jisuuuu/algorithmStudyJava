package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(total);
    }
}
