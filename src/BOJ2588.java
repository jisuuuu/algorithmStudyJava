import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(n1 * (n2 % 10));
            result += (int) (Math.pow(10, i) * n1 * (n2 % 10));
            n2 /= 10;
        }
        System.out.println(result);
    }
}
