package INFLEARN.HASHMAP_TREESET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Class4_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        int answer = 0;

        for (char x : t.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        int l = t.length() - 1;
        for (int i = 0; i < l; i++) {
            am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = l; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);

            if (am.equals(bm)) {
                answer++;
            }
            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);

            if (am.get(s.charAt(lt)) == 0) {
                am.remove(s.charAt(lt));
            }
            lt++;
        }
        System.out.println(answer);
    }
}
