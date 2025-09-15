package INFLEARN.STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_1 {
    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /* for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }*/
        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(solution(s, c));
    }
}
