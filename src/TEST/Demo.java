package TEST;

import java.util.Arrays;

public class Demo {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int maxInt = Arrays.stream(A).max().getAsInt();

        if (maxInt < 0) {
            return 1;
        }

        int[] ch = new int[maxInt];

        for (int a : A) {
            ch[a - 1] = 1;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                return i + 1;
            }
        }

        return maxInt + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1, -3}));
    }
}
