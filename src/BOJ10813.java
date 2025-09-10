import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n];

        for (int r = 0; r < n; r++) {
            baskets[r] = r + 1;
        }

        for (int r = 0; r < m; r++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int tmp = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = tmp;
        }

        for (int r = 0; r < n; r++) {
            System.out.print(baskets[r] + " ");
        }
    }
}
