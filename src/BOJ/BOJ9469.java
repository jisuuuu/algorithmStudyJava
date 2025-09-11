package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9469 {
    //폰 노이만
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            double d = Double.parseDouble(st.nextToken());;
            double a = Double.parseDouble(st.nextToken());;
            double b = Double.parseDouble(st.nextToken());;
            double f = Double.parseDouble(st.nextToken());

            System.out.println(n + " " + String.format("%.6f", ((d / (a + b)) * f)));
        }
    }
}
