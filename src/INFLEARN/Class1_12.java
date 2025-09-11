package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        for (int i = 0; i < n; i++) {
            int j = i * 7;
            String tmp = word.substring(j, j + 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            System.out.print(Character.toChars(num));
        }
        System.out.println();
    }
}
