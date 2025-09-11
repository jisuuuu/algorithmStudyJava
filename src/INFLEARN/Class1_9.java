package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_9 {
    public static int solution(String s) {
        int answer = 0;
        String w = "";
        for (char x : s.toCharArray()) {
            /*if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }*/
            if (Character.isDigit(x)) {
                w += x;
            }
        }
        answer = Integer.parseInt(w);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
        str = str.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(str));
    }
}
