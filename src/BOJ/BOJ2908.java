package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        String a_reverse = "", b_reverse = "";

        for (int i = 2; i >= 0; i--) {
            a_reverse += a.charAt(i);
            b_reverse += b.charAt(i);
        }

        if ((Integer.parseInt(a_reverse) > Integer.parseInt(b_reverse))) {
            System.out.println(a_reverse);
        } else {
            System.out.println(b_reverse);
        }
    }
}
