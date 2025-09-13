package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Class4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        HashMap<Character, Integer> result = new HashMap<>();

        for (char x : vote.toCharArray()) {
            result.put(x, result.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char key : result.keySet()) {
            if (result.get(key) > max) {
                max = result.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
