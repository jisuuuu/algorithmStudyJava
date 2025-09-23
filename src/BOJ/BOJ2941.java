package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String c : croatiaAlphabet) {
            str = str.replace(c,"A");
        }
        System.out.println(str.length());
    }
}
