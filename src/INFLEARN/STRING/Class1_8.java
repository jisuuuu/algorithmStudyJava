package INFLEARN.STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        str = str.replaceAll("[^A-Z]", "");
        System.out.println(str);
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                answer += c;
            }
        }
        String tmp = new StringBuilder(answer).reverse().toString();

        if (answer.equalsIgnoreCase(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
