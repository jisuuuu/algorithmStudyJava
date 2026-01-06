package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int n = (int) (s.charAt(i) - 97);
            if (alphabet[n] == -1) {
                alphabet[n] = i;
            }
        }
        Arrays.stream(alphabet).forEach(num -> System.out.print(num + " "));
    }
}
