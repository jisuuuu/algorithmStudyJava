package INFLEARN.STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int answer = 0;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                answer++;
            }
        }

        if (answer == str.length() / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
