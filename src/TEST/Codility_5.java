package TEST;

import java.util.Arrays;

public class Codility_5 {
    public static int solution(int[] A) {
        Arrays.sort(A);
        return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }
}
