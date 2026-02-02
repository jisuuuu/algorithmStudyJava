package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x_arr = new int[3];
        int[] y_arr = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x_arr[i] = Integer.parseInt(st.nextToken());
            y_arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = 0, y = 0;

        if (x_arr[0] == x_arr[1]) {
            x = x_arr[2];
        } else if (x_arr[0] == x_arr[2]) {
            x = x_arr[1];
        } else {
            x = x_arr[0];
        }

        if (y_arr[0] == y_arr[1]) {
            y = y_arr[2];
        } else if (y_arr[0] == y_arr[2]) {
            y = y_arr[1];
        } else {
            y = y_arr[0];
        }
        System.out.println(x + " " + y);
    }
}
