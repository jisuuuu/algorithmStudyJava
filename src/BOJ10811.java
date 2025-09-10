import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n + 1];

        for (int z = 1; z <= n; z++) {
            baskets[z] = z;
        }

        for (int z = 0; z < m; z++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            if (i == j) {
                continue;
            }

            while (i < j) {
                int tmp = baskets[j];
                baskets[j] = baskets[i];
                baskets[i] = tmp;
                i++;
                j--;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
