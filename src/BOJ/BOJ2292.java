package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 1;
        int range = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while (range <= num) {
                range = range + (answer * 6);
                answer++;
            }
            System.out.println(answer);
        }
    }
}
