package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];
            check[(int)str.charAt(0) - 97] = true;

            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (str.charAt(j - 1) == c) {
                    continue;
                }

                if (check[(int)c - 97]) {
                    count--;
                    break;
                }
                check[(int)c - 97] = true;
            }
        }
        System.out.println(count);
    }
}
