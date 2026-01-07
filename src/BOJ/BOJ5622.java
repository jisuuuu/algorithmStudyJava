package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    total += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    total += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    total += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    total += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    total += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    total += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    total += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    total += 10;
                    break;
            }
        }
        System.out.println(total);
    }
}
