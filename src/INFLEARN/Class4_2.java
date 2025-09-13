package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Class4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toUpperCase();
        String b = br.readLine().toUpperCase();
        HashMap<Character, Integer> aCount = new HashMap<>();
        HashMap<Character, Integer> bCount = new HashMap<>();

        boolean flag = true;
        for (char x : a.toCharArray()) {
            aCount.put(x, aCount.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (!aCount.containsKey(x) || aCount.get(x) == 0) {
                flag = false;
            }
            bCount.put(x, bCount.getOrDefault(x, 0) + 1);
        }

        for (char x : aCount.keySet()) {
            if (aCount.get(x) != bCount.get(x)) {
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        }
    }
}
