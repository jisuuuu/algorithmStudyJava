import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 1000001;
        int max = -1000001;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (max < value) {
                max = value;
            }

            if (min > value) {
                min = value;
            }
        }
        System.out.printf("%d %d", min, max);
        System.out.println();
    }
}
