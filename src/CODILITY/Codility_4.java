package CODILITY;

import java.util.HashMap;

public class Codility_4 {
    public static int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int a : map.keySet()) {
            if (map.get(a) == 1) {
                return a;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
