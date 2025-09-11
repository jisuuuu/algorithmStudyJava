package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (!Character.isAlphabetic(chars[l])) {
                l++;
                continue;
            }
            if (!Character.isAlphabetic(chars[r])) {
                r--;
                continue;
            }
            char tmp = chars[r];
            chars[r] = chars[l];
            chars[l] = tmp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(chars));
    }
}
