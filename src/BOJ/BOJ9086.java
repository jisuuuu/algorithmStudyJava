package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();

            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length() - 1));

            System.out.println(sb);
        }
    }
}
