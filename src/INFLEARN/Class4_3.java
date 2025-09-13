package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Class4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] money = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(money[i], map.getOrDefault(money[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(money[rt], map.getOrDefault(money[rt], 0) + 1);
            answer.add(map.size());

            map.put(money[lt], map.get(money[lt]) - 1);

            if (map.get(money[lt]) == 0) {
                map.remove(money[lt]);
            }
            lt++;
        }

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
