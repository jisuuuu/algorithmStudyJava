package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class1_4 {
    public static ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        for (String s : strings) {
            char[] chars = s.toCharArray();
            int l = 0, r = s.length() - 1;

            while (l < r) {
                char tmp = chars[r];
                chars[r] = chars[l];
                chars[l] = tmp;
                l++;
                r--;
            }
            String tmp = String.valueOf(chars);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = br.readLine();
        }
        for (String x : solution(n, strings)) {
            System.out.println(x);
        }
    }
}
