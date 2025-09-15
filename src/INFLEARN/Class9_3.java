package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time1 implements Comparable<Time1> {
    public int time;
    public char state;

    Time1(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time1 o) {
        if (this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}
public class Class9_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time1> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr.add(new Time1(s, 's'));
            arr.add(new Time1(e, 'e'));
        }

        Collections.sort(arr);

        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for (Time1 t : arr) {
            if (t.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}
