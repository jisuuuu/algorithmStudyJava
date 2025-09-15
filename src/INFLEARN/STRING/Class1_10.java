package INFLEARN.STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class1_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char c = st.nextToken().charAt(0);
        int p = 1000;
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == c) {
                p = 0;
            } else {
                p++;
                answer[j] = Math.min(answer[j], p);
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
