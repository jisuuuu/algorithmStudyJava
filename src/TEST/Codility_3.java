package TEST;

import java.util.Arrays;

public class Codility_3 {
    public static int solution(int[] A) {
        int x = 0;

        for (int a : A) {
            x ^= a;
        }

        return x;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));

    }
}
