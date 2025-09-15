package INFLEARN.GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {
    int s;
    int e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }


    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}
public class Class9_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> room = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            room.add(new Time(s, e));
        }

        int cnt = 0;
        Collections.sort(room);

        int et = 0;
        for (Time t : room) {
            if (t.s >= et) {
                cnt++;
                et = t.e;
            }
        }
        System.out.println(cnt);
    }
}
