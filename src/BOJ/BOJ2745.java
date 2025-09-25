package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int tmp = 1, result = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * tmp;
            } else {
                result += (c - 48) * tmp;
            }
            tmp *= b;
        }
        System.out.println(result);
    }
}
