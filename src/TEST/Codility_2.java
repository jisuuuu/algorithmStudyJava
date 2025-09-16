package TEST;

import java.util.Arrays;

public class Codility_2 {
    public static int[] solution(int[] A, int K) {
        int n = A.length;
        if (n == 0) return A;
        int k = K % n;
        if (k == 0) return Arrays.copyOf(A, n);

        int[] cycle = new int[n];
        for (int i = 0; i < n; i++) {
            cycle[(i + k) % n] = A[i];
        }
        return cycle;
    }
    public static void main(String[] args) {
        for (int a : solution(new int[]{3, 8, 9, 7, 6}, 3)) {
            System.out.println(a);
        }
    }
}
