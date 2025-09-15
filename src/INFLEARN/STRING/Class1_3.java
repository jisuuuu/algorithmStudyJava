package INFLEARN.STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");
        String answer = "";
        int pos;

        for (String s : strings) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }
        System.out.println(answer);

        int m = Integer.MIN_VALUE;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
        }
    }
}
