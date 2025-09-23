package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalCredits = 0;
        double totalScore = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String className = st.nextToken();
            double credits = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (score.equals("P")) {
                continue;
            } else if (score.equals("A+")) {
                totalScore += 4.5 * credits;
                totalCredits += credits;
            } else if (score.equals("A0")) {
                totalScore += 4.0 * credits;
                totalCredits += credits;
            } else if (score.equals("B+")) {
                totalScore += 3.5 * credits;
                totalCredits += credits;
            } else if (score.equals("B0")) {
                totalScore += 3 * credits;
                totalCredits += credits;
            } else if (score.equals("C+")) {
                totalScore += 2.5 * credits;
                totalCredits += credits;
            } else if (score.equals("C0")) {
                totalScore += 2 * credits;
                totalCredits += credits;
            } else if (score.equals("D+")) {
                totalScore += 1.5 * credits;
                totalCredits += credits;
            } else if (score.equals("D0")) {
                totalScore += 1 * credits;
                totalCredits += credits;
            } else {
                totalScore += 0;
                totalCredits += credits;
            }
        }
        System.out.println(totalScore / totalCredits);
    }
}
