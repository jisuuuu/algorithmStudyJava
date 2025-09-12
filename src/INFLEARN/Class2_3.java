package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1)) {
                System.out.println("B");
            } else if ((b[i] == 1 && a[i] == 2) || (b[i] == 2 && a[i] == 3) || (b[i] == 3 && a[i] == 1)) {
                System.out.println("A");
            } else {
                System.out.println("D");
            }
        }
    }
}
