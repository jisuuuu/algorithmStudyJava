package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Character> array = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (!array.contains(c)) {
                array.add(c);
            }
        }

        for (Character c : array) {
            System.out.print(c);
        }
        System.out.println();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
